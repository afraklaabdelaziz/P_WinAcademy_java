package com.company;

public class User {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String email;
    protected String phone;
    protected String password;
    protected String status;

    public User(int id, String lastName, String firstName, String email, String phone, String password, String status) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }

    public User() {

    }
}
