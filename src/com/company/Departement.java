package com.company;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Departement {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String name;
    private String description;
    private HashMap<Integer,Enseignant> enseignant = new HashMap<Integer,Enseignant>();
    private Enseignant responsable = new Enseignant();
    public Departement(){};
    public Departement( String name, String description) {
        this.id = _ID.incrementAndGet();
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
