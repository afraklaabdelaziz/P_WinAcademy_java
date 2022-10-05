package com.company;

import java.util.Scanner;

public class Main {
        SevriceAdmin sevriceAdmin = new SevriceAdmin();
        int choix;
        Scanner sc = new Scanner(System.in);
        public void menu(){
                        System.out.println("             BienVenue au WinAcademy           ");
                        System.out.println("***************** Menu Principal ****************");
                        System.out.print("1 : college\t\t\t"); System.out.println("2 : departement");
                        System.out.print("3 : matier\t\t\t"); System.out.println("4 : Enseignant");
                        System.out.print("5 : Etudiant\t\t"); System.out.println("6 : Evaluation");

                        System.out.println("        pour quiter le programme clic sur any button         ");
                        System.out.println("**************************************************");
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
                                        menuEtudiant();
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
                System.out.println("8 : tout les matier");
                System.out.println("9 : moyen des notes");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("pour quiter le programme clic sur any button");
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
                        case 8 :
                                sevriceAdmin.allMatierParCollege();
                                menuCollege();
                                break;
                        case 9 :
                                System.out.println("1 : par departement\n2 : par matier\n3 : par Etudiant");
                                int numero = sc.nextInt();
                                switch (numero){
                                        case 1 :
                                                sevriceAdmin.moyenOfNoteDepartement();
                                                break;
                                        case 2 :
                                                sevriceAdmin.moyenOfNoteParMatier();
                                                break;
                                        case 3 :
                                                sevriceAdmin.moyenParEtudiant();
                                                break;
                                }
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
                System.out.println("6 :  tous les matiers de departement");
                System.out.println("7 : supprimer une departement");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("pour quiter le programme clic sur any button");
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
                                sevriceAdmin.allMatierParDepartement();
                                menuDepartement();
                                break;
                        case 7 :
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
                System.out.println("4 : Asegner matier au Enseignant");
                System.out.println("5 : supprimer Enseignant");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("pour quiter le programme clic sur any button");
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
                                sevriceAdmin.asiegneMatier();
                                menuEnseignant();
                                break;
                        case 5 :
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
          System.out.println("4 : edite Matier");
          System.out.println("5 : pour supprimer Matier");
          System.out.println("00 : pour retour au menu principale");
          System.out.println("pour quiter le programme clic sur any button");
          System.out.println("*********************************");
          choix = sc.nextInt();
          switch (choix)
          {
                  case 1 :
                          sevriceAdmin.addMatier();
                          menuMatier();
                          break;
                  case 2 :
                          sevriceAdmin.rechercheMatier();
                          menuMatier();
                          break;
                  case 3 :
                          sevriceAdmin.getAllMatier();
                          menuMatier();
                          break;
                  case 4 :
                          sevriceAdmin.editMatier();
                          menuMatier();
                          break;
                  case 5 :
                          sevriceAdmin.removeMatier();
                          menuMatier();
                          break;
                  case 00 :
                          menu();
                          break;
          }
  }

        public void menuEtudiant(){
                System.out.println("***************** Menu Etudiant ****************");
                System.out.println("1 : ajouter Etudiant");
                System.out.println("2 : chercher  Etudiant");
                System.out.println("3 : voir tout les etudiants");
                System.out.println("4 : edite etudiant");
                System.out.println("5 : asigner matier a etudiant");
                System.out.println("6 : Matier n'es pas noter");
                System.out.println("7 : supprimer Etudiant ");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("pour quiter le programme clic sur any button");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addEtudiant();
                                menuEtudiant();
                                break;
                        case 2 :
                                sevriceAdmin.rechercheEtudiant();
                                menuEtudiant();
                                break;
                        case 3 :
                                sevriceAdmin.getAlletudiant();
                                menuEtudiant();
                                break;
                        case 4 :
                                sevriceAdmin.editeEtudiant();
                                menuEtudiant();
                                break;
                        case 5 :
                                sevriceAdmin.aseignerMatierEtudiant();
                                menuEtudiant();
                                break;
                        case 6 :
                                sevriceAdmin.matierPasNote();
                                menuEtudiant();
                                break;
                        case 7 :
                                sevriceAdmin.removeEtudiant();
                                menuEtudiant();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }


        public void menuEvaluation(){
                System.out.println("***************** Menu Etudiant ****************");
                System.out.println("1 : ajouter Evualuation");
                System.out.println("2 : voir tout les evaluation par matier");
                System.out.println("3 : edite evualtion");
                System.out.println("4 : supprimer Evaluation ");
                System.out.println("00 : pour retour au menu principale");
                System.out.println("pour quiter le programme clic sur any button");
                System.out.println("*********************************");
                choix = sc.nextInt();

                switch (choix)
                {
                        case 1 :
                                sevriceAdmin.addEvaluation();
                                menuEvaluation();
                                break;
                        case 2 :
                                sevriceAdmin.allEvaluationParMatire();
                                menuEvaluation();
                                break;
                        case 3 :
                                sevriceAdmin.editeEvaluation();
                                menuEvaluation();
                                break;
                        case 4:
                                sevriceAdmin.removeEvaluation();
                                menuEvaluation();
                                break;
                        case 00 :
                                menu();
                                break;
                }
        }


    public static void main(String[] args) {
                Data data = new Data();
        data.insertData();
       Main main = new Main();
       main.menu();

    }
}
