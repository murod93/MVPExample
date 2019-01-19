package com.example.hp.mvpexample.root;

import com.example.hp.mvpexample.MainActivity;
import com.example.hp.mvpexample.http.ApiModule;
import com.example.hp.mvpexample.login.LoginActivity;
import com.example.hp.mvpexample.login.LoginModule;
import com.example.hp.mvpexample.profile.ProfileActivity;
import com.example.hp.mvpexample.profile.ProfileModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ApplicationModule.class, LoginModule.class, ProfileModule.class, ApiModule.class})
@Singleton
public interface ApplicationComponent {
    void inject(LoginActivity target);
    void inject(ProfileActivity target);
    void inject(MainActivity target);
}
