package com.ira.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private EditText inputNim, inputName, inputEmail, inputPassword;
    private Button submit_button;
    private TextView resultNim, resultName, resultEmail, resultPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        inputNim = (EditText)findViewById(R.id.input_nim);
        inputName = (EditText)findViewById(R.id.input_name);
        inputEmail = (EditText)findViewById(R.id.input_email);
        inputPassword = (EditText)findViewById(R.id.input_password);

        submit_button = (Button)findViewById(R.id.submit_button);

        resultNim = (TextView)findViewById(R.id.result_nim);
        resultName = (TextView)findViewById(R.id.result_name);
        resultEmail = (TextView)findViewById(R.id.result_email);
        resultPassword = (TextView)findViewById(R.id.result_password);
    }

    public void submit(View view) {
        String nim = inputNim.getText().toString();
        resultNim.setText(nim);

        String name = inputName.getText().toString();
        resultName.setText(name);

        String email = inputEmail.getText().toString();
        resultEmail.setText(email);

        String password = inputPassword.getText().toString();
        resultPassword.setText(password);
    }
}