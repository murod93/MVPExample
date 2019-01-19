package com.example.hp.mvpexample.profile;

import com.example.hp.mvpexample.root.User;

public interface ProfileRepository {
    User getUser();
    void saveUser(User user);
}
