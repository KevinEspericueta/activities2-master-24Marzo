package com.example.rodolfo.activities2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.rodolfo.activities2.models.User;
import com.example.rodolfo.activities2.views.MainActivity;
import com.example.rodolfo.activities2.views.SignUpActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {
        EditText userEdt = findViewById(R.id.username);
        String username = userEdt.getText().toString();

        String password = ((EditText)findViewById(R.id.password)).getText().toString();


        /* Validate Credentials */


        User user = new User(username, username+"@test.com", password);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("username", username);
        intent.putExtra("user_id", user.getId());

        intent.putExtra("user", user);

        /* Calls the new activity*/
        startActivity(intent);
    }

    public void signup(View v) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
