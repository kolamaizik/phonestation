package by.mk.training.phonestation.service;

import java.lang.reflect.Field;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.dataaccess.impl.AbstractDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class UserServiceTest {

    @Inject
    private UserService userService;

    @Inject
    private UserProfileDao userProfileDao;

    @Test
    public void test() {
        Assert.assertNotNull(userService);
    }

    @Test
    public void testEntityManagerInitialization() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field f = AbstractDaoImpl.class.getDeclaredField("entityManager");
        f.setAccessible(true);
        EntityManager em = (EntityManager) f.get(userProfileDao);

        Assert.assertNotNull(em);
    }

}
