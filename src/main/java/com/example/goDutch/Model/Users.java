package com.example.goDutch.Model;

// User.java
import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class Users {
    @Id
    private int USER_ID;
    private String username;
    private String email;

    // Constructors, getters, and setters

    // Constructors
    public Users() {
    }


    public Users(int USER_ID, String username, String email) {
        this.USER_ID = USER_ID;
        this.username = username;
        this.email = email;
    }

    // Getters and setters
    public int getUser_ID() {
        return USER_ID;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
