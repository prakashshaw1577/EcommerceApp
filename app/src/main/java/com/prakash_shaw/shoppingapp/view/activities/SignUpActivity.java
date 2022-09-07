
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

public class SignUpActivity extends AppCompatActivity {

    EditText username, useremail, userpassword, userrepassword;
    Button signUp;
    TextView signIn;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = findViewById(R.id.userName);
        useremail = findViewById(R.id.email);
        userpassword = findViewById(R.id.userPassword);
        userrepassword = findViewById(R.id.rePassword);
        signIn = findViewById(R.id.signInTxt);
        signUp = findViewById(R.id.signUpBtn);
        DB = new DBHelper(this);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String email = useremail.getText().toString();
                String password = userpassword.getText().toString();
                String repassword = userrepassword.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(SignUpActivity.this, "All Feilds Required", Toast.LENGTH_SHORT).show();
                }else{
                    if(password.equals(repassword)){
                        Boolean checkuser =DB.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = DB.insertData(user, email, password);
                            if (insert = true) {
                                Toast.makeText(SignUpActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), ECartHomeActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignUpActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }

                        }else{
                            Toast.makeText(SignUpActivity.this, "User already Exists", Toast.LENGTH_SHORT).show();
                        }

                    } else{
                            Toast.makeText(SignUpActivity.this, "Password are not matching", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}