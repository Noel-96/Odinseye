package com.noel_inc.odinseye.register_user;

import dagger.Module;
import dagger.Provides;

@Module
public class SignUpModule {
    @Provides
    public  SignUpActivityMVP.Presenter provideSignUpActivityPresenter (SignUpActivityMVP.Model model){
        return  new SignUpActivityPresenter(model);
    }


    @Provides
    public  SignUpActivityMVP.Model provideSignUpActivityModel(SignUpRepo repo){
        return new SignUpModel(repo);
    }



    @Provides
    public  SignUpRepo provideSignUpRepo(){
        return new SignUpDataRepo();
    }
}
