package com.example.gladd.phitapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    private static EditText Username;
    private static EditText Password;
    private static Button Login;
    private static TextView Info;
    private static Button SignUp;
    int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        LoginButton();
        SignUpButton();

    }
    private void SignUpButton()
    {
        SignUp =findViewById(R.id.btnsignup);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LoginScreen.this, SignUpScreen.class);
                startActivity(intent2);
            }
        });
    }
    private void LoginButton () {
            Username = findViewById(R.id.etUsername);
            Password = findViewById(R.id.etPassword1);
            Login = findViewById(R.id.btnLogin);
            Info = findViewById(R.id.tvInfo);


            Info.setText(Integer.toString(counter));

            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String Username1 = Username.getText().toString().trim();

                    if (Username.getText().toString().equals("Admin") && Password.getText().toString().equals("1234")) {
                        Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        System.out.println("NOPE" + Username.getText() + Password.getText());

                        Toast pass = Toast.makeText(LoginScreen.this, "Passwords don't match", Toast.LENGTH_SHORT);
                        pass.show();

                        counter--;

                        Info.setText(Integer.toString(counter));

                        if (counter == 0) {
                            Login.setEnabled(false);
                        }

                    }


                }

            });

        }

    }


