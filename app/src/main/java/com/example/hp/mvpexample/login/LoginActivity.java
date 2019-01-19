package com.example.hp.mvpexample.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.mvpexample.R;
import com.example.hp.mvpexample.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @Inject
    LoginActivityMVP.Presenter presenter;

    EditText firstNameView;
    EditText lastNameView;
    Button btnRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App) getApplication()).getComponent().inject(this);


        firstNameView = (EditText)findViewById(R.id.first_name_view);
        lastNameView = (EditText)findViewById(R.id.last_name_view);
        btnRegistration = (Button)findViewById(R.id.btn_register);

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();

        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return firstNameView.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastNameView.getText().toString();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "First Name or Last Name can not be empty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String firstName) {
        firstNameView.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        lastNameView.setText(lastName);
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User saved successfully", Toast.LENGTH_SHORT).show();
    }
}
