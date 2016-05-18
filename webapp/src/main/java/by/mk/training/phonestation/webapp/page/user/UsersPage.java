package by.mk.training.phonestation.webapp.page.user;

import javax.inject.Inject;

import by.mk.training.phonestation.service.UserProfileService;
import by.mk.training.phonestation.webapp.page.AbstractPage;
import by.mk.training.phonestation.webapp.page.user.panel.UserProfileListPanel;

public class UsersPage extends AbstractPage {

	@Inject
	private UserProfileService userProfileService;

    public UsersPage() {
        super();
        add(new UserProfileListPanel("list-panel"));
    }
}
