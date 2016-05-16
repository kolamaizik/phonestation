package by.mk.training.phonestation.webapp.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import by.mk.training.phonestation.webapp.page.component.menu.MenuPanel;
import by.mk.training.phonestation.webapp.page.component.menu.MenuPanelLoggedUser;
import by.mk.training.phonestation.webapp.page.user.UsersPage;

public abstract class AbstractPage extends WebPage {
	public AbstractPage() {
        super();
    }

    public AbstractPage(PageParameters parameters) {
        super(parameters);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        if (getPage().getClass().equals(UsersPage.class)) {
            add(new MenuPanelLoggedUser("menu-panel"));
        } else {
            add(new MenuPanel("menu-panel"));
        }
    }
}