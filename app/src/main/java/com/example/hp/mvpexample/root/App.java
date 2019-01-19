package com.example.hp.mvpexample.root;

import android.app.Application;

import com.example.hp.mvpexample.http.ApiModule;
import com.example.hp.mvpexample.login.LoginModule;
import com.example.hp.mvpexample.profile.ProfileModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .profileModule(new ProfileModule())
                .apiModule(new ApiModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
