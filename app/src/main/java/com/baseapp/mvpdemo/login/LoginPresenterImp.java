package com.baseapp.mvpdemo.login;

import android.app.Activity;
import android.text.TextUtils;

import com.baseapp.mvpdemo.base.BasePresenter;

/**
 * Created by tunglam on 11/11/16.
 */

public class LoginPresenterImp extends BasePresenter<LoginView.view> implements LoginView.presenter {
    
    Activity activity;

    public LoginPresenterImp(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void validata(String pass, String username) {
        if (TextUtils.isEmpty(username)) {
            getView().Error(" Username is not empty");
        } else if (TextUtils.isEmpty(pass)) {
            getView().Error(" Password is not empty");

        } else {
            login(pass, username);
        }

    }

    @Override
    public void login(String pass, String username) {
        getView().success("Login Success");
    }
}
