package com.noel_inc.odinseye.register_user;

import android.support.annotation.Nullable;

public class SignUpActivityPresenter implements  SignUpActivityMVP.Presenter {

    @Nullable
    private  SignUpActivityMVP.View view;
    private  SignUpActivityMVP.Model model;

    public SignUpActivityPresenter(SignUpActivityMVP.Model model) {
        this.model = model;
    }




}
