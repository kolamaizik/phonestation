package by.mk.training.phonestation.service;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.User;
import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserService {
	@Transactional
    void register(UserProfile profile, User user);

    UserProfile getProfile(Long id);

    User getUser(Long id);

    @Transactional
    void update(UserProfile profile);

    @Transactional
    void delete(Long id);

}
