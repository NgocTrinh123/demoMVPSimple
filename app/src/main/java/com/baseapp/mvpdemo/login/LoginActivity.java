package com.baseapp.mvpdemo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.baseapp.mvpdemo.MainActivity;
import com.baseapp.mvpdemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tunglam on 11/11/16.
 */

public class LoginActivity extends AppCompatActivity implements LoginView.view {

    @Bind(R.id.password)
    EditText etPassword;

    @Bind(R.id.username)
    EditText etUserName;

    @Bind(R.id.progress)
    ProgressBar process;

    LoginPresenterImp loginPresenterImp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginPresenterImp = new LoginPresenterImp(this);
        loginPresenterImp.attachView(this);
    }

    @OnClick(R.id.button)
    public void login() {
        loginPresenterImp.validata(etPassword.getText().toString(), etUserName.getText().toString());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        loginPresenterImp.detachView();
    }


    @Override
    public void Error(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    public void success(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
