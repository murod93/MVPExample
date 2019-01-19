package com.example.hp.mvpexample.profile;

import com.example.hp.mvpexample.root.User;

public class DBRepository implements ProfileRepository {

    User user;

    @Override
    public User getUser() {
        if (user == null){
            user = new User("Abdukholikov",
                    "Murodjon", "Android Developer",
                    "Image URl", "Uzbekistan");
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
