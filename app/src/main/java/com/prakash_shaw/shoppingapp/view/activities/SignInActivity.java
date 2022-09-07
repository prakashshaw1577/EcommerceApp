/*
 * Copyright (c) 2022. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.prakash_shaw.shoppingapp.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.prakash_shaw.shoppingapp.R;

public class SignInActivity extends AppCompatActivity {

    EditText username, userpassword;
    TextView signup;
    Button signin;
    DBHelper DB;

    String user_name, user_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = (EditText) findViewById(R.id.user_name);
        userpassword = (EditText) findViewById(R.id.user_password);
        signup = (TextView) findViewById(R.id.signUpTxt);
        signin = (Button) findViewById(R.id.SignInBtn);


        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user_name = username.getText().toString();
                user_password = userpassword.getText().toString();


                if (TextUtils.isEmpty(user_name) || TextUtils.isEmpty(user_password)) {
                    Toast.makeText(SignInActivity.this, "All Feilds Required", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkUserPassword = DB.checkUsernamePassword(user_name, user_password);
                    if(checkUserPassword == true){
                        Toast.makeText(SignInActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        username.setText("");
                        userpassword.setText("");
                        Intent intent = new Intent(getApplicationContext(), ECartHomeActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(SignInActivity.this, "Login Failed Try Again", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}