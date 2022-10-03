package com.company;

import java.util.HashMap;

public class Departement {
    private int id;
    private String name;
    private String description;
    private HashMap<Integer,Enseignant> enseignant = new HashMap<Integer,Enseignant>();
    private Enseignant responsable = new Enseignant();
  public Departement(){};
    public Departement(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<Integer, Enseignant> getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(HashMap<Integer, Enseignant> enseignant) {
        this.enseignant = enseignant;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public void addResponsable(){

    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", enseignant=" + enseignant +
                ", responsable=" + responsable +
                '}';
    }
}
