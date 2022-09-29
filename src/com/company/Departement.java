package com.company;

import java.util.HashMap;

public class Departement {
    public int id;
    public String name;
    public String description;
    HashMap<Integer,Enseignant> enseignant = new HashMap<Integer,Enseignant>();
  public Departement(){};
    public Departement(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public void addEnseignant(int id,String date, String lastName, String firstName, String email, String phone, String password, String status){
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
