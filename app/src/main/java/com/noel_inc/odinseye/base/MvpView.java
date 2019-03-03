package com.noel_inc.odinseye.base;

import android.support.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();



    void onError(String message);



    void showMessage(String message);


    boolean isNetworkConnected();

    void hideKeyboard();

}
