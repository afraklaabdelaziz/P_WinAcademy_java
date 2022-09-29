package com.company;

public class Etudiant extends User {
    public int id;
    public String anneeEntree;

    public Etudiant(int id, String lastName, String firstName, String email, String phone, String password, String status) {
        super(id, lastName, firstName, email, phone, password, status);
        this.id = id;
        this.anneeEntree = anneeEntree;
    }
}
