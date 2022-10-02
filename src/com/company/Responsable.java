package com.company;

public class Responsable{
    private int id;
    private int id_departement;
    private int id_enseignant;
    private String dateDebut;
    private String dateFin;

    public Responsable(int id, int id_departement, int id_enseignant, String dateDebut, String dateFin) {
        this.id = id;
        this.id_departement = id_departement;
        this.id_enseignant = id_enseignant;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
