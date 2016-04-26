package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.datamodel.UserProfile;

@Repository
public class UserProfileDaoImpl extends AbstractDaoImpl<UserProfile, Long> implements UserProfileDao {

	protected UserProfileDaoImpl(Class<UserProfile> entityClass) {
		super(entityClass);
	}
}
