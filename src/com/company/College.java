package com.company;

import java.util.HashMap;

public class College{
    private int numero;
    private String name;
    private String site;
    private Adress adress ;
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
    public College(){}
    public College(int numero, String name, String site) {
        this.numero = numero;
        this.name = name;
        this.site = site;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
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

