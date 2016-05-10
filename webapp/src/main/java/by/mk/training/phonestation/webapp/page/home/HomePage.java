package by.mk.training.phonestation.webapp.page.home;

import org.apache.wicket.markup.html.link.Link;

import by.mk.training.phonestation.webapp.page.AbstractPage;
import by.mk.training.phonestation.webapp.page.user.UserPage;

public class HomePage extends AbstractPage {

    public HomePage() {
        super();
        add(new Link("linkuser") {
            @Override
            public void onClick() {
                setResponsePage(new UserPage());
            }
        });
    }

}
