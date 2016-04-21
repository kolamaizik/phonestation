package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.UserProfileDao;
import by.mk.training.phonestation.datamodel.UserProfile;

@Repository
public class UserProfileDaoImpl extends AbstractDaoImpl implements UserProfileDao {

	@Override
	public UserProfile get(Long id) {
		return null;
	}

	@Override
	public UserProfile save() {
		return null;
	}

}
