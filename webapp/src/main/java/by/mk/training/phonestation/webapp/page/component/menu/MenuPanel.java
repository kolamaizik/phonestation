package by.mk.training.phonestation.webapp.page.component.menu;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

import by.mk.training.phonestation.webapp.page.home.HomePage;
import by.mk.training.phonestation.webapp.page.measure.MeasurePage;
import by.mk.training.phonestation.webapp.page.price.PricePage;
import by.mk.training.phonestation.webapp.page.service.ServicePage;
import by.mk.training.phonestation.webapp.page.user.UsersPage;

public class MenuPanel extends Panel {

    public MenuPanel(String id) {
        super(id);
        // setRenderBodyOnly(true);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new Link("link-home") {
            @Override
            public void onClick() {
                setResponsePage(new HomePage());
            }
        });

        add(new Link("link-users") {
            @Override
            public void onClick() {
                setResponsePage(new UsersPage());
            }
        });
        
        add(new Link("link-services") {
            @Override
            public void onClick() {
                setResponsePage(new ServicePage());
            }
        });
        
        add(new Link("link-measures") {
            @Override
            public void onClick() {
                setResponsePage(new MeasurePage());
            }
        });
        
        add(new Link("link-prices") {
            @Override
            public void onClick() {
                setResponsePage(new PricePage());
            }
        });

    }
}
