package com.baseapp.mvpdemo.login;

import com.baseapp.mvpdemo.base.BaseView;

/**
 * Created by tunglam on 11/11/16.
 */

public interface LoginView {
    interface presenter {
        void validata(String pass, String username);

        void login(String pass, String username);

    }

    interface view extends BaseView {

        void Error(String message);

        void success(String message);
    }
}
