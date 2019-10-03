package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;

    private EditText editTextLogin;

    private String nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextLogin = findViewById(R.id.login_et_nickname);
        loginButton = findViewById(R.id.login_btn_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextLogin.getText().toString();
                if(!user.equals("")){
                    nickname = user;
                }
                else{
                    Toast toast = Toast.makeText(LoginActivity.this, "Please type your nickname", Toast.LENGTH_SHORT);
                    toast.show();
                }

                Log.e(">>>>>>>", user);

            }
        });
    }





    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
