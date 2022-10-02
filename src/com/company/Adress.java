package com.company;

public class Adress {
    private int id;
    private String ville;
    private String pays;
    private String codePostal;
    private String adress;

    public Adress(int id, String ville, String pays, String codePostal, String adress) {
        this.id = id;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }




}
