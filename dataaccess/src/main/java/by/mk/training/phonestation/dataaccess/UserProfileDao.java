package by.mk.training.phonestation.dataaccess;

import by.mk.training.phonestation.datamodel.UserProfile;

public interface UserProfileDao {

    UserProfile get(Long id);

    UserProfile save();
}
