package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MainActivity";
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.loginButton);

    }

    public void loginButton(View view) {
        EditText email = findViewById(R.id.user_id);
        EditText pwd = findViewById(R.id.user_pwd);
        String email_con = email.getText().toString();
        String pwd_con = pwd.getText().toString();
        if(!email_con.isEmpty()) {
            if(!pwd_con.isEmpty()) {
                Log.i(TAG, "id : " + email_con + ", password : " + pwd_con);
                return ;
            }
            Log.i(TAG,"비밀번호를 입력하셔야 합니다.");
            return;
        }
        Log.i(TAG,"이메일을 입력하셔야 합니다.");
        return;
    }



}