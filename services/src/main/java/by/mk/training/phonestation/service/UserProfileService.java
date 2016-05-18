package by.mk.training.phonestation.service;

import java.util.List;

import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserProfileService {

	UserProfile getUserProfile(Long id);

	List<UserProfile> getAll();

	Long count(UserFilter filter);

	List<UserProfile> find(UserFilter filter);
}