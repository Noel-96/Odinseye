package com.noel_inc.odinseye.root;


import android.app.Application;

import com.noel_inc.odinseye.register_user.SignUpModule;

public class App extends Application {

    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this))
                .signUpModule(new SignUpModule())
                .build();

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}