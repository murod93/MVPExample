package com.example.hp.mvpexample.root;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String nationality;
    private String profilePhoto;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName,
                String lastName,
                String position,
                String profilePhoto,
                String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position =position;
        this.profilePhoto = profilePhoto;
        this.nationality = nationality;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setProfilePhoto(String profilePhoto){
        this.profilePhoto = profilePhoto;
    }

    public String getNationality(){
        return nationality;
    }

    public String getProfilePhoto(){
        return profilePhoto;
    }

    public String getPosition(){
        return position;
    }

}
