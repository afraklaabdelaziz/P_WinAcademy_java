package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String email;
    protected String phone;
    protected String password;
    protected String status;

    public User(String lastName, String firstName, String email, String phone, String password, String status) {
        this.id = _ID.incrementAndGet();
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User() {

    }
}
