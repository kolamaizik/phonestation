package by.mk.training.phonestation.dataaccess;

import java.util.List;

import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserProfileDao extends AbstractDao<UserProfile, Long> {

	List<UserProfile> find(UserFilter filter);
	Long count(UserFilter filter);
}