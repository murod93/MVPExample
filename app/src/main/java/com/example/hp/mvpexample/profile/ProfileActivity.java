package com.example.hp.mvpexample.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hp.mvpexample.R;
import com.example.hp.mvpexample.root.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity implements ProfileActivityMVP.View {

    @Inject
    ProfileActivityMVP.Presenter presenter;

    @BindView(R.id.txtFirstName)
    EditText firstNameView;
    @BindView(R.id.txtLastName)
    EditText lastNameView;
    @BindView(R.id.txtPosition)
    EditText positionView;
    @BindView(R.id.txtNationality)
    EditText nationalityView;
    @BindView(R.id.btnSaveChanges)
    Button btnSave;
    @BindView(R.id.imageView)
    ImageView profilePhotoView;

    private String profilePhotoUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        ((App) getApplication()).getComponent().inject(this);
    }

    @Override
    public void onResume(){
        super.onResume();

        presenter.setView(this);
        presenter.getProfileInfo();
    }

    @OnClick(R.id.btnSaveChanges)
    void onSaveClick(){
        presenter.saveChanges();
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
    public String getNationality() {
        return nationalityView.getText().toString();
    }

    @Override
    public String getPosition() {
        return positionView.getText().toString();
    }

    @Override
    public String profilePhoto() {
        return profilePhotoUrl;
    }

    @Override
    public void setUserInformation(String firstName, String lastName, String nationality, String position) {
        firstNameView.setText(firstName);
        lastNameView.setText(lastName);
        nationalityView.setText(nationality);
        positionView.setText(position);
    }

    @Override
    public void setProfilePhoto(String url) {

    }

    @Override
    public void showValidationError() {
        Toast.makeText(this, "User information fields should not be empty", Toast.LENGTH_SHORT).show();
    }
}
