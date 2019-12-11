package com.example.rentcar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    EditText usernameEditTxt,passwordEditTxt,studentNameEditTxt;
    Button loginBtn;
    String strUserName = "student1",password = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(studentNameEditTxt.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Please Enter Student Name ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(usernameEditTxt.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Please Enter UserName ", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(passwordEditTxt.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Please Enter Password ", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!(usernameEditTxt.getText().toString().equalsIgnoreCase(strUserName))){
                    Toast.makeText(LoginActivity.this, "Invaild UserName Try Again! ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!(passwordEditTxt.getText().toString().equalsIgnoreCase(password))){
                    Toast.makeText(LoginActivity.this, "Invaild Password ", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("studentName",studentNameEditTxt.getText().toString());

                startActivity(intent);

            }
        });
    }


    private void initView() {
        usernameEditTxt = findViewById(R.id.username);
        passwordEditTxt = findViewById(R.id.password);
        studentNameEditTxt = findViewById(R.id.studentName);
        loginBtn = findViewById(R.id.loginButton);

    }
}
