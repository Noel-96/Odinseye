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


    @OnClick(R.id.reg_signup_button)
    public void onClick(View view) {

    }

    private FirebaseAuth auth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth = FirebaseAuth.getInstance();

        ButterKnife.bind(this);


    }

    private  void  SignUpAction(){
        String email = req_email_sign_up.getText().toString().trim();
        String username = req_name_sign_up.getText().toString().trim();
        String password = req_password_sign_up.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.length() < 6) {
            Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);


        //create user
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(SignUpActivity.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(SignUpActivity.this, "Authentication failed." + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                            finish();
                        }
                    }
                });

    }

    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }
}








