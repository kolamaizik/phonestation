package by.mk.training.phonestation.dataaccess;

import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserProfileDao extends AbstractDao<UserProfile, Long>  {

    UserProfile get(Long id);

    UserProfile save();
}
