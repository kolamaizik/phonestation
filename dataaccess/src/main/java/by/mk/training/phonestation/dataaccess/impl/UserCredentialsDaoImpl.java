package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.UserCredentialsDao;
import by.mk.training.phonestation.datamodel.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends AbstractDaoImpl<UserCredentials, Long> implements UserCredentialsDao {

    protected UserCredentialsDaoImpl() {
        super(UserCredentials.class);
    }
}
