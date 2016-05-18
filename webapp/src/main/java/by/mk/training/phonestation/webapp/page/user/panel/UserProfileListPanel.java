package by.mk.training.phonestation.webapp.page.user.panel;

import java.io.Serializable;
import java.util.Iterator;

import javax.inject.Inject;
import javax.persistence.metamodel.SingularAttribute;

import org.apache.wicket.datetime.markup.html.basic.DateLabel;
import org.apache.wicket.extensions.markup.html.repeater.data.sort.OrderByBorder;
import org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.datamodel.UserProfile_;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.service.UserProfileService;

public class UserProfileListPanel extends Panel {

	@Inject
    private UserProfileService userProfileService; 
    
	public UserProfileListPanel(String id) {
		super(id);
		
		UsersDataProvider usersDataProvider = new UsersDataProvider();
		
		DataView<UserProfile> dataView = new DataView<UserProfile>("rows", usersDataProvider, 5){
			protected void populateItem(Item<UserProfile> item) {
				UserProfile userProfile = item.getModelObject();

                item.add(new Label("id", userProfile.getId()));
                item.add(new Label("fname", userProfile.getFirstName()));
                item.add(new Label("lname", userProfile.getLastName()));
                item.add(new Label("address", userProfile.getAddress()));
                item.add(DateLabel.forDatePattern("created", Model.of(userProfile.getCreated()), "dd-MM-yyyy"));
/*
                CheckBox checkbox = new CheckBox("blocked", Model.of(userProfile.isBlocked()));
                checkbox.setEnabled(false);
                item.add(checkbox);
*/
            }
        };
        
        add(dataView);
		add(new PagingNavigator("paging", dataView));

        add(new OrderByBorder("sort-id", UserProfile_.id, usersDataProvider));
        add(new OrderByBorder("sort-fname", UserProfile_.firstName, usersDataProvider));
        add(new OrderByBorder("sort-lname", UserProfile_.lastName, usersDataProvider));
        add(new OrderByBorder("sort-address", UserProfile_.address, usersDataProvider));
        add(new OrderByBorder("sort-created", UserProfile_.created, usersDataProvider));
	}

	private class UsersDataProvider extends SortableDataProvider<UserProfile, Serializable> {

        private UserFilter userFilter;

        public UsersDataProvider() {
            super();
            userFilter = new UserFilter();
            setSort((Serializable) UserProfile_.firstName, SortOrder.ASCENDING);
        }

        @Override
        public Iterator<UserProfile> iterator(long first, long count) {
            Serializable property = getSort().getProperty();
            SortOrder propertySortOrder = getSortState().getPropertySortOrder(property);

            userFilter.setSortProperty((SingularAttribute) property);
            userFilter.setSortOrder(propertySortOrder.equals(SortOrder.ASCENDING) ? true : false);

            userFilter.setLimit((int) count);
            userFilter.setOffset((int) first);
            return userProfileService.find(userFilter).iterator();
        }

        @Override
        public long size() {
            return userProfileService.count(userFilter);
        }

        @Override
		public IModel<UserProfile> model(UserProfile object) {
			return new Model(object);
		}
    }
}
