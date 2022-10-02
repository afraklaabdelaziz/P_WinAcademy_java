package com.company;

import java.util.HashMap;

public class Departement {
    private int id;
    private String name;
    private String description;
    private HashMap<Integer,Enseignant> enseignant = new HashMap<Integer,Enseignant>();
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

    public void addEnseignant(int id, String date, String lastName, String firstName, String email, String phone, String password, String status){
        this.enseignant.put(id,new Enseignant(id,date,lastName,firstName,email,phone,password,status));
    }
    public void removeEnseignant(int id){
        this.enseignant.remove(id);
    }
    public Enseignant rchercheEnseignant(int id){
        return this.enseignant.get(id);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", enseignant=" + enseignant +
                '}';
    }
}
