package com.gapestation.triptrackerbrian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEmailEditText;
    EditText mPasswordEditText;
    EditText mNameEditText;
    Button mLoginButton;
    TextView mSignUpTextView;
    Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailEditText = (EditText)findViewById(R.id.enter_email);
        mPasswordEditText = (EditText)findViewById(R.id.enter_password);
        mNameEditText = (EditText)findViewById(R.id.enter_name);
        mLoginButton = (Button)findViewById(R.id.login_button);
        mSignUpTextView = (TextView)findViewById(R.id.sign_up_text);
        mSignUpButton = (Button)findViewById(R.id.sign_up_button);

        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mSignUpTextView.getText() == getString(R.string.sign_up_text)) {
                    mNameEditText.setVisibility(View.VISIBLE);
                    mSignUpButton.setVisibility(View.VISIBLE);
                    mLoginButton.setVisibility(View.GONE);
                    mSignUpTextView.setText("Cancel Sign Up");
                }
                else{
                    mNameEditText.setVisibility(View.GONE);
                    mSignUpButton.setVisibility(View.GONE);
                    mLoginButton.setVisibility(View.VISIBLE);
                    mSignUpTextView.setText(R.string.sign_up_text);
                }
            }
        });
    }
}
