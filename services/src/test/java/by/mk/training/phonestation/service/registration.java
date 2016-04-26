package by.mk.training.phonestation.service;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.datamodel.User;
import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.datamodel.UserRole;

public class registration {
	@Inject
    private UserService userService;

    @Inject
    private UserProfileDao userProfileDao;
    
    @Test
    public void testRegistration() {
        UserProfile profile = new UserProfile();
        User user = new User();

        profile.setFirstName("testFName");
        profile.setLastName("testLName");

        user.setEmail(System.currentTimeMillis() + "mail@test.by");
        user.setPassword("pswd");
        user.setRole(UserRole.admin);
        userService.register(profile, user);

        UserProfile registredProfile = userService.getProfile(profile.getId());
        User registredCredentials = userService.getUser(user.getId());

        Assert.assertNotNull(registredProfile);
        Assert.assertNotNull(registredCredentials);

        String updatedFName = "updatedName";
        profile.setFirstName(updatedFName);
        userService.update(profile);

        Assert.assertEquals(updatedFName, userService.getProfile(profile.getId()).getFirstName());

        userService.delete(profile.getId());

        Assert.assertNull(userService.getProfile(profile.getId()));
        Assert.assertNull(userService.getUser(user.getId()));
    }
}
