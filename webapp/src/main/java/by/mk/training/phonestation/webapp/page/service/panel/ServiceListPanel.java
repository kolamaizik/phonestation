package by.mk.training.phonestation.webapp.page.service.panel;

import java.io.Serializable;
import java.util.Iterator;

import javax.inject.Inject;
import javax.persistence.metamodel.SingularAttribute;

import org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import by.mk.training.phonestation.dataaccess.filters.ServiceFilter;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.Services;
import by.mk.training.phonestation.datamodel.Services_;
import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.datamodel.UserProfile_;

public class ServiceListPanel extends Panel {

	@Inject
	private Services service;
	
	private class ServicesDataProvider extends SortableDataProvider<Services, Serializable> {

        private ServiceFilter userFilter;

        public ServicesDataProvider() {
            super();
            userFilter = new ServiceFilter();
            setSort((Serializable) Services_.name, SortOrder.ASCENDING);
        }

        @Override
        public Iterator<Services> iterator(long first, long count) {
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
		public IModel<Services> model(Services object) {
			return new Model(object);
		}
    }
}
