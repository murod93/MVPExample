package com.example.hp.mvpexample.login;

import com.example.hp.mvpexample.root.User;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);

}
