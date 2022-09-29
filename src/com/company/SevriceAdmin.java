package com.company;

import java.util.Scanner;

public class SevriceAdmin {
    App app = new App();
    Scanner sc =  new Scanner(System.in);

//College

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

//departement

    public void addDepartement(){
        getAllCollege();
        System.out.println("Entrer numuro de college que tu va inserer cette departement");
        int idCollege = sc.nextInt();
        System.out.println("entrer le numero de Departement ");
        int numeroDepartement = sc.nextInt();
        System.out.println("entrer le nom de Departement ");
        String nomDepartement = sc.next();
        System.out.println("entrer description de Departement ");
        String descDepartement = sc.next();
        app.addDepartement(numeroDepartement,nomDepartement,descDepartement,idCollege);
    }
    public void getAllDepartement(){
        getAllCollege();
        System.out.println("Entrer numuro de college que tu va afficher les departements");
        int idCollege = sc.nextInt();
        app.getAllDepartement(idCollege);

    }

    public void getDepartement(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        app.getDepartement(numero,idDepartement);
    }

    public void removeDepartement(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        app.removeDepartement(numero,idDepartement);
    }

//adress

    public void addAdress(){
        getAllCollege();
        System.out.println("Entrer numuro de college que tu va inserer cet Adress");
        int idCollege = sc.nextInt();
        System.out.println("entrer id Adress ");
        int idAdress= sc.nextInt();
        System.out.println("entrer ville ");
        String ville = sc.next();
        System.out.println("entrer pays ");
        String pays = sc.next();
        System.out.println("entrer codePostal");
        String codePostal = sc.next();
        System.out.println("entrer adress");
        String adress = sc.next();
        app.addAdress(idAdress,ville,pays,codePostal,adress,idCollege);
    }

//Enseinant

    public void addEnsiegnant(){
        getAllCollege();
        System.out.println("Entrer numuro de college que tu va inserer cet Enseignant");
        int idCollege = sc.nextInt();
        app.getCollege(idCollege);
        System.out.println("Entrer numuro de departement que tu va inserer cet Enseignant");
        int idDepartement = sc.nextInt();
        app.getDepartement(idDepartement,idCollege);
        System.out.println("Entrer id Enseignant");
         int id = sc.nextInt();
        System.out.println("Entrer date de fonction");
        String date = sc.next();
        System.out.println("Entrer lastName");
        String lastname = sc.next();
        System.out.println("Entrer firstNAme");
        String firstname = sc.next();
        System.out.println("Entrer email");
        String email = sc.next();
        System.out.println("Entrer phone");
        String phone = sc.next();
        System.out.println("Entrer password");
        String password = sc.next();
        System.out.println("Entrer status");
        String status = sc.next();
        app.addEnsiegnant(id,date,lastname,firstname,email,phone,password,status,idCollege,idDepartement);
    }

    public void getAllEnseignant(){
        getAllCollege();
        System.out.println("Entrer numuro de college que tu va afficher les departements");
        int idCollege = sc.nextInt();
        System.out.println("Entrer numuro de departement que tu va afficher les Enseignant");
        int idDepartement = sc.nextInt();
        app.getAllEnseignant(idCollege,idDepartement);
    }


    public void getEnseignant(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        System.out.println("Entrer le numero  de Enseignant");
        int idEnseignant = sc.nextInt();
        app.getEnseignant(numero,idDepartement,idEnseignant);
    }

    public void removeEnseignant(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        System.out.println("Entrer le numero  de Enseignant");
        int idEnseignant = sc.nextInt();
        app.removeDepartement(numero,idEnseignant);
    }


}
