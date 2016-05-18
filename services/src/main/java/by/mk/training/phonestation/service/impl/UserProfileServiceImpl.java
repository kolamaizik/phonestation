package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.UserProfile;
import by.mk.training.phonestation.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Inject
	private UserProfileDao userProfileDao;

	@Override
	public UserProfile getUserProfile(Long id) {
		return userProfileDao.get(id);
	}

	@Override
	public List<UserProfile> getAll() {
		return userProfileDao.getAll();
	}

	@Override
	public Long count(UserFilter filter) {
		return userProfileDao.count(filter);
	}

	@Override
	public List<UserProfile> find(UserFilter filter) {
		return userProfileDao.find(filter);
	}
}