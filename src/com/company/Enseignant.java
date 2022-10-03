package com.company;
public class Enseignant extends User{
    private int id;
    private String dateFonction;
    private Matier matier;

    public Enseignant(){
        super();
    }
    public Enseignant(int id,String dateFonction, String lastName, String firstName, String email, String phone, String password, String status) {
        super(id, lastName, firstName, email, phone, password, status);
        this.id = id;
        this.dateFonction = dateFonction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateFonction() {
        return dateFonction;
    }

    public void setDateFonction(String dateFonction) {
        this.dateFonction = dateFonction;
    }

    public Matier getMatier() {
        return matier;
    }

    public void setMatier(Matier matier) {
        this.matier = matier;
    }

    public void addMatier(int id,String name,String desciption){
        this.matier = new Matier(id,name,desciption);
    }


    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", dateFonction='" + dateFonction + '\'' +
                ", matier=" + matier +
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
