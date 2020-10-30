package com.ira.projects;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText username, password;
    private TextView tittle, author;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittle = (TextView) findViewById(R.id.text_tittle);
        author = (TextView) findViewById(R.id.text_author);

        username = (EditText) findViewById(R.id.edit_username);
        password = (EditText) findViewById(R.id.edit_password);
    }

    public void launchThirdActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void launchSecondActivity(View view) {
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        if (usernameKey.equals("pab") && passwordKey.equals("miniProject")) {
            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            MainActivity.this.startActivity(intent);
            //finish();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Username or Password is wrong!")
                    .setNegativeButton("Retry", null).create().show();
        }
    }
}