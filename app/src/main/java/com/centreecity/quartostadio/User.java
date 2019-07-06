package com.centreecity.quartostadio;

public class User {

     String userId;
     String username;
     String name;
     String surname;


    public User () {

    }


    public User(String UserId, String username,String name,String surname,String zipcode) {
        this.userId = userId;
        this.username = username;
        this.username = username;
        this.surname = surname;

    }

    public String getUserId() {

        return userId;
    }

    public String getUsername() {

        return username;
    }

    public String getName() {

        return username;
    }

    public String getSurname() {

        return surname;
    }


}
