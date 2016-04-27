package by.mk.training.phonestation.service;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserService {

	@Transactional
	void register(UserProfile profile, UserCredentials user);

	UserProfile getProfile(Long id);

	UserCredentials getUser(Long id);

	@Transactional
	void update(UserProfile profile);

	@Transactional
	void delete(Long id);

}
