package com.example.hp.mvpexample.profile;

import com.example.hp.mvpexample.root.User;

public class ProfileActivityMVP {

    public interface View{
        String getFirstName();
        String getLastName();
        String getNationality();
        String getPosition();
        String profilePhoto();

        void setUserInformation(String firstName, String lastName, String nationality, String position);
        void setProfilePhoto(String url);
        void showValidationError();
    }

    public interface Presenter{
        void setView(ProfileActivityMVP.View view);
        void saveChanges();
        void getProfileInfo();
    }

    public interface Model{
        User getProfileInfo();
        void saveChanges(String firstName, String lastName,
                         String position, String nationality,
                         String profilePhoto);
    }
}
