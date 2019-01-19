package com.example.hp.mvpexample.profile;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.example.hp.mvpexample.root.User;

public class ProfilePresenter implements ProfileActivityMVP.Presenter {

    @Nullable
    ProfileActivityMVP.Model model;
    ProfileActivityMVP.View view;

    public ProfilePresenter(ProfileActivityMVP.Model model){
        this.model = model;
    }

    @Override
    public void setView(ProfileActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void saveChanges() {
        if (view!=null){
            if (view.getFirstName().trim().equals("")
                    || view.getLastName().trim().equals("")
                    ||view.getNationality().trim().equals("")){
                view.showValidationError();
            }
        }
    }

    @Override
    public void getProfileInfo() {
        User user = model.getProfileInfo();
        if (user!=null && view!=null){
            view.setUserInformation(user.getFirstName(), user.getLastName(), user.getNationality(), user.getPosition());
            if (!TextUtils.isEmpty(user.getProfilePhoto())){
                view.setProfilePhoto(user.getProfilePhoto());
            }
        }
    }
}
