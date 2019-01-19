package com.example.hp.mvpexample.login;

import com.example.hp.mvpexample.root.User;

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {
        if(user == null){
            user = new User("Dummy Name", "Dummy Last Name");
            user.setId(0);
        }

        return user;
    }

    @Override
    public void saveUser(User user) {
        if (user == null){
            user = getUser();
        }
        this.user = user;
    }
}
