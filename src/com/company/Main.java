package com.company;

import java.util.Scanner;

public class Main {
        SevriceAdmin sevriceAdmin = new SevriceAdmin();
        int choix;
        Scanner sc = new Scanner(System.in);
        public void menu(){
                        System.out.println("***************** Menu Principal ****************");
                        System.out.println("1 : college");
                        System.out.println("2 : departement");
                        System.out.println("3 : matier");
                        System.out.println("4 : Enseignant");
                        System.out.println("5 : Etudiant");
                        System.out.println("6 : Evaluation");
                        System.out.println("0 : pour quiter");
                        System.out.println("************************************************");
                        choix = sc.nextInt();
                        switch (choix) {
                                case 1:
                                        menuCollege();
                                        break;
                                case 2:
                                        menuDepartement();
                                        break;
                                case 3:
                                       menuMatier();
                                        break;

                                case 4:
                                        menuEnseignant();
                                        break;

                                case 5:
                                       System.out.println("etudiant");
                                        break;
                                case 6:
                                        menuEvaluation();
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
                System.out.println("5 : ajouter adress on college");
                System.out.println("6 : recherche college");
                System.out.println("7 : edite  college");
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
                        case 5 :
                                sevriceAdmin.addAdress();
                                menuCollege();
                                break;
                        case 6 :
                                sevriceAdmin.rechercheCollege();
                                menuCollege();
                                break;
                        case 7 :
                                sevriceAdmin.editeCollege();
                                menuCollege();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }

 // Menu Departement

        public void menuDepartement(){
                System.out.println("***************** Menu Departement ****************");
                System.out.println("1 : ajouter Departement");
                System.out.println("2 : chercher une  Departement");
                System.out.println("3 : voir tout les departement");
                System.out.println("4 :  edite departement");
                System.out.println("5 :  ajouter responsable a departement");
                System.out.println("6 : supprimer une departement");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("0 : pour quiter");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addDepartement();
                                menuDepartement();
                                break;
                        case 2 :
                                sevriceAdmin.getDepartement();
                                menuDepartement();
                                break;
                        case 3 :
                                sevriceAdmin.getAllDepartement();
                                menuDepartement();
                                break;
                        case 4 :
                                sevriceAdmin.editDepartement();
                                menuDepartement();
                                break;
                        case 5 :
                                sevriceAdmin.addResponsable();
                                menuDepartement();
                                break;
                        case 6 :
                                sevriceAdmin.removeDepartement();
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
                                sevriceAdmin.addEnsiegnant();
                                menuEnseignant();
                                break;
                        case 2 :
                                sevriceAdmin.getEnseignant();
                                menuEnseignant();
                                break;
                        case 3 :
                                sevriceAdmin.getAllEnseignant();
                                menuEnseignant();
                                break;
                        case 4 :
                                sevriceAdmin.removeEnseignant();
                                menuEnseignant();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }
  // menu Matier
  public void menuMatier(){
          System.out.println("***************** Menu Matier ****************");
          System.out.println("1 : ajouter une matier");
          System.out.println("2 : chercher une matier");
          System.out.println("3 : voir tout les matier");
          System.out.println("4 : supprimer une matier");
          System.out.println("00 : pour retour au menu principale");
          System.out.println("0 : pour quiter");
          System.out.println("*********************************");
          choix = sc.nextInt();
          switch (choix)
          {
                  case 1 :
                          sevriceAdmin.addMatier();
                          menuMatier();
                          break;
                  case 2 :
                          sevriceAdmin.getCollege();
                          menuMatier();
                          break;
                  case 3 :
                          sevriceAdmin.getAllMatier();
                          menuMatier();
                          break;
                  case 4 :
                          sevriceAdmin.removeCollege();
                          menuMatier();
                          break;
                  case 00 :
                          menu();
                          break;
          }
  }

        public void menuEvaluation(){
                System.out.println("***************** Menu ****************");
                System.out.println("1 : ajouter Evaluation");
                System.out.println("2 : chercher  Evualuation");
                System.out.println("3 : voir tout les Evaluation");
                System.out.println("4 : supprimer Evaluation ");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("0 : pour quiter");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addCollege();
                                menuEvaluation();
                                break;
                        case 2 :
                                sevriceAdmin.getCollege();
                                menuEvaluation();
                                break;
                        case 3 :
                                sevriceAdmin.getAllCollege();
                                menuEvaluation();
                                break;
                        case 4 :
                                sevriceAdmin.removeCollege();
                                menuEvaluation();
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
