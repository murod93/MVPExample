package com.example.hp.mvpexample.profile;

import dagger.Module;
import dagger.Provides;

@Module
public class ProfileModule {

    @Provides
    public ProfileActivityMVP.Presenter provideProfileActivityPresenter(ProfileActivityMVP.Model model){
        return new ProfilePresenter(model);
    }

    @Provides
    public ProfileActivityMVP.Model provideProfileActivityModel(ProfileRepository repository){
        return new ProfileModel(repository);
    }

    @Provides
    public ProfileRepository provideProvideRepository(){
        return new DBRepository();
    }

}


