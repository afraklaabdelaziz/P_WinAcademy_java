package com.company;

public class User {
    public int id;
    public String lastName;
    public String firstName;
    public String email;
    public String phone;
    public String password;
    public String status;

    public User(int id, String lastName, String firstName, String email, String phone, String password, String status) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }
}
