package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.UserDao;
import by.mk.training.phonestation.datamodel.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Long> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }
}
