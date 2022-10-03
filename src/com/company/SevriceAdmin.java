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

    public void editeCollege(){
        System.out.println("Enter numero de college que tu va editer");
        int idCollege = sc.nextInt();
        app.getCollege(idCollege);
        System.out.println("1 : pour edite name \n 2 : pour edite Site");
        int numero = sc.nextInt();
        System.out.println("Enter noveau value");
        String newValue = sc.next();
        app.editeCollege(idCollege,numero,newValue);
    }

    public void removeCollege(){
        System.out.println("Entrer le numero de college que tu va  supprimer");
        int numero = sc.nextInt();
        app.removeCollege(numero);
    }

    public void rechercheCollege(){
        System.out.println("etrer le nom ou le site pour chercher  de college");
        String name = sc.next();
        app.rechercheCollege(name);
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

    public void editDepartement(){
        System.out.println("Entere le numero du college de departement");
        int idCollege = sc.nextInt();
        System.out.println("Entrer le numero de departement");
        int idDepartement = sc.nextInt();
        app.getDepartement(idCollege,idDepartement);
        System.out.println("1 : pour edite name \n2 : pour edite description");
        int numero = sc.nextInt();
        String newValue = sc.next();
        app.editDepartement(idCollege,idDepartement,numero,newValue);
    }

    public void addResponsable(){
        System.out.println("Entere le numero du college de departement");
        int idCollege = sc.nextInt();
        System.out.println("Entrer le numero de departement");
        int idDepartement = sc.nextInt();
        app.getDepartement(idCollege,idDepartement);
        System.out.println("Choisir le responsable de departement");
        app.getAllEnseignant(idCollege,idDepartement);
        int idResponsable = sc.nextInt();
        app.addResponsable(idCollege,idDepartement,idResponsable);
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
        app.getDepartement(numero,idDepartement);
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
        app.getDepartement(numero,idDepartement);
        System.out.println("Entrer le numero  de Enseignant");
        int idEnseignant = sc.nextInt();
        app.removeEnseignant(numero,idDepartement,idEnseignant);
    }

    //Matier

    public void addMatier(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        app.getDepartement(numero,idDepartement);
        System.out.println("Entrer le numero  de Enseignant");
        int idEnseignant = sc.nextInt();
        app.getEnseignant(numero,idDepartement,idEnseignant);
        System.out.println("Entrer id de matier");
        int idMatier = sc.nextInt();
        System.out.println("Entrer name de matier");
        String name = sc.next();
        System.out.println("Entrer description de matier");
        String description = sc.next();
        app.addMatier(idMatier,name,description,numero,idDepartement,idEnseignant);
    }
    public void getAllMatier(){
        System.out.println("Entrer le numero de college de departement");
        int numero = sc.nextInt();
        app.getCollege(numero);
        System.out.println("Entrer le numero  de departement");
        int idDepartement = sc.nextInt();
        app.getDepartement(numero,idDepartement);
        app.getAllMatier(numero,idDepartement);
    }


}
