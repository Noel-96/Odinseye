package com.noel_inc.odinseye.root;

import com.noel_inc.odinseye.register_user.SignUpActivity;
import com.noel_inc.odinseye.register_user.SignUpModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class , SignUpModule.class})
public interface ApplicationComponent {


    void inject (SignUpActivity target);

}

