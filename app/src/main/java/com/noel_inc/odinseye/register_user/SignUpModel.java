package com.noel_inc.odinseye.register_user;

public class SignUpModel implements  SignUpActivityMVP.Model {

    private  SignUpRepo repo;

    public SignUpModel(SignUpRepo repo) {
        this.repo = repo;
    }
}
