package com.company;

import java.util.Scanner;

public class SevriceAdmin {
    App app = new App();
    Scanner sc =  new Scanner(System.in);
    public void addCollege(){

        System.out.println("entrer le numero de college ");
        int numeroCollege = sc.nextInt();
        System.out.println("entrer le nom de college ");
        String nomCollege = sc.next();
        System.out.println("entrer site de college ");
        String siteCollege = sc.next();
        app.addCollege(numeroCollege,nomCollege,siteCollege);
    }
    public void getCollege(){
        System.out.println("Entrer le numero de college que tu va  chercher");
        int numero = sc.nextInt();
        app.getCollege(numero);
    }
    public void getAllCollege(){
        app.getAllCollege();
    }
    public void removeCollege(){
        System.out.println("Entrer le numero de college que tu va  supprimer");
        int numero = sc.nextInt();
        app.removeCollege(numero);
    }
    public void addDepartement(){

        System.out.println("entrer le numero de Departement ");
        int numeroDepartement = sc.nextInt();
        System.out.println("entrer le nom de Departement ");
        String nomDepartement = sc.next();
        System.out.println("entrer description de Departement ");
        String descDepartement = sc.next();
        app.addDepartement(numeroDepartement,nomDepartement,descDepartement);
    }


}
