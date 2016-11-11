package com.baseapp.mvpdemo.base;

/**
 * Created by mb on 3/30/16.
 */
public interface IPresenter<V> {
    void attachView(V mvpView);

    void detachView();
}
