package com.company;
public class Enseignant extends User{
    private String dateFonction;
    private int  idmatier;

    public Enseignant(){
        super();
    }
    public Enseignant(int id,String dateFonction, String lastName, String firstName, String email, String phone, String password, String status) {
        super(id, lastName, firstName, email, phone, password, status);
        this.id = id;
        this.dateFonction = dateFonction;
    }

    public String getDateFonction() {
        return dateFonction;
    }

    public void setDateFonction(String dateFonction) {
        this.dateFonction = dateFonction;
    }

    public int getIdmatier() {
        return idmatier;
    }

    public void setIdmatier(int idmatier) {
        this.idmatier = idmatier;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", dateFonction='" + dateFonction + '\'' +
                ", idmatier=" + idmatier +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
