package com.tutorial.techinicaltest.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.tutorial.techinicaltest.R;
import com.tutorial.techinicaltest.database.Preferences;
import com.tutorial.techinicaltest.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginPresenter.LoginPresenterView {

    EditText email,password;
    Button login;
    LoginPresenter loginPresenter;
    private SVProgressHUD mSVProgressHUD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        loginPresenter=new LoginPresenter(LoginActivity.this);
        mSVProgressHUD = new SVProgressHUD(this);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validCheck=true;
                if(email.getText().toString().trim().equals(null) || email.getText().toString().trim().equals("")){
                    email.setError("Please enter email");
                    validCheck=false;
                }
                if(password.getText().toString().trim().equals(null) || password.getText().toString().trim().equals("") ){
                    password.setError("Please enter your password");
                    validCheck=false;
                }

                if(validCheck){
                    mSVProgressHUD.showWithStatus("Please Wait");
                    loginPresenter.retrofitLogin(email.getText().toString(),password.getText().toString(),"login");

                }










            }
        });


    }

    @Override
    public void getErrorSignUpPresenter(String error) {
        mSVProgressHUD.dismiss();

        Toast.makeText(this, error, Toast.LENGTH_LONG).show();

    }

    @Override
    public void responceSignup(String resonse, String accessToken, String rtmToken,String fullName) {
        mSVProgressHUD.dismiss();

        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();

//-----------------Saving it to the shared preference for future use -------------
        Preferences.getInstance(this).update(Preferences.accessToken,accessToken);
        Preferences.getInstance(this).update(Preferences.rtmToken,rtmToken);
        Preferences.getInstance(this).update(Preferences.fullName,fullName);
//----------------------------------------------------------------------------------------

        Intent i = new Intent(LoginActivity.this, PageNo2.class);
        i.putExtra("accessToken", accessToken);
        startActivity(i);



    }
}