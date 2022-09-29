package com.company;

public class Responsable{
    public int id;
    public int id_departement;
    public int id_enseignant;
    public String dateDebut;
    public String dateFin;

    public Responsable(int id, int id_departement, int id_enseignant, String dateDebut, String dateFin) {
        this.id = id;
        this.id_departement = id_departement;
        this.id_enseignant = id_enseignant;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
