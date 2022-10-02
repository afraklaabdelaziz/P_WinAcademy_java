package com.company;

import java.util.HashMap;

public class College{
    private int numero;
    private String name;
    private String site;
    private Adress adress ;
    private HashMap<Integer,Departement> departements = new HashMap<Integer,Departement>();

    public void addAdress(int id,String ville,String pays,String codePostal,String adress){
        this.adress = new Adress(id,ville,pays,codePostal,adress);
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

    public HashMap<Integer, Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(HashMap<Integer, Departement> departements) {

        this.departements = departements;
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

