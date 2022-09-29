package com.company;

import java.util.HashMap;

public class College{
    public int numero;
    public String name;
    public String site;
    public Adress adress ;
    HashMap<Integer,Departement> departements = new HashMap<Integer,Departement>();

    public void addAdress(int id,String ville,String pays,String codePostal,String adress){
        this.adress = new Adress(id,ville,pays,codePostal,adress);
    }

    public void addDeparetements(int id, String name, String description){
        this.departements.put(id,new Departement(id,name,description));
    }
    public void removeDepartement(int id){
        this.departements.remove(id);
    }
    public Departement chercherDeparetement(int id){
        return this.departements.get(id);
    }
    public College(int numero, String name, String site) {
        this.numero = numero;
        this.name = name;
        this.site = site;
    }


    @Override
    public String toString() {
        return "College{" +
                "numero=" + numero +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", adress=" + adress +
                ", departements=" + departements +
                '}';
    }
}

