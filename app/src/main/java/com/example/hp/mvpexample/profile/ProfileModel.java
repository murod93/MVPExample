package com.example.hp.mvpexample.profile;

import com.example.hp.mvpexample.root.User;

public class ProfileModel implements ProfileActivityMVP.Model {

    ProfileRepository repository;

    public ProfileModel(ProfileRepository repository){
        this.repository = repository;
    }

    @Override
    public User getProfileInfo() {
        return repository.getUser();
    }

    @Override
    public void saveChanges(String firstName, String lastName, String position, String nationality, String profilePhoto) {
        repository.saveUser(new User(firstName, lastName, position, profilePhoto, nationality));
    }
}
