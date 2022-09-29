package com.company;

import java.util.Scanner;

public class Main {
        SevriceAdmin sevriceAdmin = new SevriceAdmin();
        int choix;
        Scanner sc = new Scanner(System.in);
        public void menu(){
                        System.out.println("***************** Menu ****************");
                        System.out.println("1 : college");
                        System.out.println("2 : user");
                        System.out.println("3 : departement");
                        System.out.println("4 : matier");
                        System.out.println("5 : Enseignant");
                        System.out.println("6 : Etudiant");
                        System.out.println("7 : Evaluation");
                        System.out.println("0 : pour quiter");
                        System.out.println("*********************************");

                        choix = sc.nextInt();
                        switch (choix) {
                                case 1:
                                        menuCollege();
                                        break;

                                case 2 :
                                        menuDepartement();
                                        break;

                                case 3:
                                        sevriceAdmin.addDepartement();
                                        break;
                                case 4:
                                        System.out.println("6666");
                                        break;

                                case 5:
                                        menuEnseignant();
                                        break;

                                case 6:
                                        System.out.println("6666");
                                        break;
                                case 7:
                                        System.out.println("77777");
                                        break;
                                default:
                                        break;
                        }
        }

  // Menu College

        public void menuCollege(){
                System.out.println("***************** Menu College  ****************");
                System.out.println("1 : ajouter college");
                System.out.println("2 : chercher une  College");
                System.out.println("3 : voir tout les colleges");
                System.out.println("4 : supprimer ine college");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("0 : pour quiter");
                System.out.println("*********************************");
                Scanner college = new Scanner(System.in);
                choix = college.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addCollege();
                                menuCollege();
                                break;
                        case 2 :
                                sevriceAdmin.getCollege();
                                menuCollege();
                                break;
                        case 3 :
                                sevriceAdmin.getAllCollege();
                                menuCollege();
                                break;
                        case 4 :
                                sevriceAdmin.removeCollege();
                                menuCollege();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }

 // Menu Departement

        public void menuDepartement(){
                System.out.println("***************** Menu DEpartement ****************");
                System.out.println("1 : ajouter Departement");
                System.out.println("2 : chercher une  Departement");
                System.out.println("3 : voir tout les departement");
                System.out.println("4 : supprimer une departement");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("0 : pour quiter");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addCollege();
                                menuDepartement();
                                break;
                        case 2 :
                                sevriceAdmin.getCollege();
                                menuDepartement();
                                break;
                        case 3 :
                                sevriceAdmin.getAllCollege();
                                menuDepartement();
                                break;
                        case 4 :
                                sevriceAdmin.removeCollege();
                                menuDepartement();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }

 // Enseignant Menu

        public void menuEnseignant(){
                System.out.println("***************** Menu Enseignant ****************");
                System.out.println("1 : ajouter Enseignant");
                System.out.println("2 : chercher une  Enseignant");
                System.out.println("3 : voir tout Enseignant");
                System.out.println("4 : supprimer Enseignant");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("0 : pour quiter");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addCollege();
                                menuEnseignant();
                                break;
                        case 2 :
                                sevriceAdmin.getCollege();
                                menuEnseignant();
                                break;
                        case 3 :
                                sevriceAdmin.getAllCollege();
                                menuEnseignant();
                                break;
                        case 4 :
                                sevriceAdmin.removeCollege();
                                menuEnseignant();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }


    public static void main(String[] args) {

       Main main = new Main();
       main.menu();

    }
}
