package com.noel_inc.odinseye;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    @BindView(R.id.reg_email_et)
    EditText req_email_sign_up;
    @BindView(R.id.reg_name_et)
    EditText req_name_sign_up;
    @BindView(R.id.reg_password_et)
    EditText req_password_sign_up;
    @BindView(R.id.progressBar)
    EditText progressBar;
    @BindView(R.id.reg_signup_button)
    Button SignUpButton;
    @BindView(R.id.req_login_activity)
    EditText req_login_intent;
    @BindView(R.id.req_help_slider_activity)
    EditText req_help_slider_intent;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);


    }



    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }
}








