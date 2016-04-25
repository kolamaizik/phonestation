package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.UserDao;
import by.mk.training.phonestation.datamodel.User;

public class UserDaoImpl extends AbstractDaoImpl<User, Long> implements UserDao {

	protected UserDaoImpl(Class<User> entityClass) {
		super(entityClass);
	}
}
