package by.mk.training.phonestation.service;
import java.lang.reflect.Field;
import java.util.Date;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.dataaccess.impl.AbstractDaoImpl;
import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.datamodel.UserRole;

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

    @Test
    public void testRegistration() {
    	UserProfile profile = new UserProfile();
        UserCredentials user = new UserCredentials();

        profile.setFirstName("testFName");
        profile.setLastName("testLName");
        profile.setAddress("BLK 29");

        user.setEmail(System.currentTimeMillis() + "mail@test.by");
        user.setPassword("pswd");
        user.setRole(UserRole.admin);
        userService.register(profile, user);

        UserProfile registredProfile = userService.getProfile(profile.getId());
        UserCredentials registredUser = userService.getUser(user.getId());

        Assert.assertNotNull(registredProfile);
        Assert.assertNotNull(registredUser);

        String updatedFName = "updatedName";
        profile.setFirstName(updatedFName);
        userService.update(profile);

        Assert.assertEquals(updatedFName, userService.getProfile(profile.getId()).getFirstName());
/*
        userService.delete(profile.getId());

        Assert.assertNull(userService.getProfile(profile.getId()));
        Assert.assertNull(userService.getUser(user.getId()));
*/
    }
}
