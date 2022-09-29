package com.company;

public class Enseignant extends User{
    public int id;
    public String dateFonction;

    public Enseignant(int id,String dateFonction, String lastName, String firstName, String email, String phone, String password, String status) {
        super(id, lastName, firstName, email, phone, password, status);
        this.id = id;
        this.dateFonction = dateFonction;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", dateFonction='" + dateFonction + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
