package com.example.hp.mvpexample.login;

import com.example.hp.mvpexample.root.User;

public class LoginActivityMVP {

    public interface View{
        String getFirstName();
        String getLastName();

        void showInputError();

        void setFirstName(String firstName);

        void setLastName(String lastName);

        void showUserSavedMessage();
    }

    public interface Presenter{
        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    public interface Model{
        void createUser(String name, String lastName);

        User getUser();
    }
}
