package by.mk.training.phonestation.service.impl;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.UserCredentialsDao;
import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserProfileDao userProfileDao;

	@Inject
	private UserCredentialsDao userDao;

	@Override
	public void register(UserProfile profile, UserCredentials user) {
		userDao.insert(user);
		profile.setUser(user);

		profile.setCreated(new Date());
		userProfileDao.insert(profile);
	}

	@Override
	public UserProfile getProfile(Long id) {
		return userProfileDao.get(id);
	}

	@Override
	public UserCredentials getUser(Long id) {
		return userDao.get(id);
	}

	@Override
	public void update(UserProfile profile) {
		userProfileDao.update(profile);
	}

	@Override
	public void delete(Long id) {
		userProfileDao.delete(id);
		userDao.delete(id);
	}
}