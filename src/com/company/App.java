package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    private College college;
     private static HashMap<Integer,College> colleges = new HashMap<>();
     private static HashMap<Integer,Matier> matiers = new HashMap<>();
     private static HashMap<Integer,Etudiant> etudiants = new HashMap<>();


    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public HashMap<Integer, College> getColleges() {
        return colleges;
    }

    public void setColleges(HashMap<Integer, College> colleges) {
        App.colleges = colleges;
    }

    public HashMap<Integer, Matier> getMatiers() {
        return matiers;
    }

    public void setMatiers(HashMap<Integer, Matier> matiers) {
        this.matiers = matiers;
    }

    public HashMap<Integer, Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(HashMap<Integer, Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public void addCollege(String nom, String site){
        college = new College(nom, site);
         colleges.put(college.getNumero(),college);
         System.out.println(colleges.toString());
     }
     public void getCollege(int numero){
        System.out.println(colleges.get(numero));
     }

     public void getAllCollege(){
         colleges.forEach(
                 (key, value)
                         ->
             System.out.println(key + " = " + value));
         }

         public void rechercheCollege(String search){
        colleges.forEach((key,value) -> {
            if (value.getName().equals(search) || value.getSite().equals(search)){
                System.out.println(key + " = " + value);
            }
        });
         }

         public void editeCollege(int idCollege,int update,String newValue){
                if (update == 1){
                    colleges.get(idCollege).setName(newValue);
                }
                else if(update == 2){
                    colleges.get(idCollege).setSite(newValue);
                }
         }


    public void removeCollege(int numero){
        colleges.remove(numero);
    }

     public void addDepartement(String name, String description,int idCollege){
        Departement departement = new Departement(name,description);
            colleges.get(idCollege).getDepartements().put(departement.getId(),departement);
     }

     public void getAllDepartement(int idCollege){
        colleges.get(idCollege).getDepartements().forEach((key,value) -> System.out.println(key + " = " + value));
     }

     public void getDepartement(int idCollege,int idDepartement){
         System.out.println(colleges.get(idCollege).getDepartements().get(idDepartement));
     }

     public void editDepartement(int idCollege,int idDepartement,int update,String newValue){
        switch (update){
            case 1 : colleges.get(idCollege).getDepartements().get(idDepartement).setName(newValue);
                break;
            case 2 : colleges.get(idCollege).getDepartements().get(idDepartement).setDescription(newValue);
                break;
        }
     }

     public void addResponsable(int idCollege,int idDepartement,int idEnseignant){
        Enseignant responsable = colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().get(idEnseignant);
         colleges.get(idCollege).getDepartements().get(idDepartement).setResponsable(responsable);
     }

     public void removeDepartement(int idCollege,int idDepartement){

        colleges.get(idCollege).getDepartements().remove(idDepartement);
     }

    public void addAdress(String ville,String pays,String adress,String codePostal,int idCollege) {
        colleges.get(idCollege).addAdress(ville, pays, codePostal, adress);
  }

  public void addEnsiegnant(String date, String lastName, String firstName, String email, String phone, String password, String status,int idCollege,int idDepartement){
        Enseignant enseignant = new Enseignant(date,lastName,firstName,email,phone,password,status);
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().put(enseignant.getId(),enseignant);
  }


  public void getAllEnseignant(int idCollege,int idDepartement){
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().forEach((key, value) -> System.out.println(key + " = " + value));
  }

    public void getEnseignant(int idCollege,int idDepartement,int idEnseignant){
        System.out.println(colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().get(idEnseignant));
    }

    public void asiegneMatier(int idCollege,int idDepartement,int idEnseignant,int idMatier){
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().get(idEnseignant).setIdmatier(idMatier);
    }

    public void removeEnseignant(int idCollege,int idDepartement,int idEnseignant){
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().remove(idEnseignant);
    }

    public void addMatier(String name,String description){
        Matier matier = new Matier(name,description);
        matiers.put(matier.getId(),matier);
    }

    public void getAllMatier(){
        matiers.forEach(
                (key, value)
                        ->
                        System.out.println(key + " = " + value));
    }

    public void allMatierParCollege(int idCollege){
        colleges.get(idCollege).getDepartements().forEach((kd,vd) ->
                vd.getEnseignant().forEach((ke,ve)->
                        {
                            if (ve.getIdmatier() !=0 ) {
                                matiers.forEach((km,vm) ->
                                        {
                                            if (ve.getIdmatier() == vm.getId()) {
                                                System.out.println(km + " = "+ vm);
                                            }
                                        }
                                        );
                            }
                        }
                ));
    }

    public void allMatierParDepartement(int idCollege,int idDepartement){
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().forEach((ke,ve)->
                {
                    if (ve.getIdmatier() !=0 ) {
                        matiers.forEach((km,vm) ->
                                {
                                    if (ve.getIdmatier() == vm.getId()) {
                                        System.out.println(km + " = "+ vm);
                                    }
                                }
                        );
                    }
                }
        );
    }

    public void editMatier(int idMatier,int update,String newValue){
        switch(update){
            case 1:
                matiers.get(idMatier).setName(newValue);
                break;
            case 2:
                matiers.get(idMatier).setDescription(newValue);
                break;
        }
    }
    public void removeMatier(int idMatier){
        colleges.forEach((kc,vc) ->
                vc.getDepartements().forEach((kd,vd)->
                   vd.getEnseignant().forEach((ke,ve)->
                           {
                               if (ve.getIdmatier() == idMatier) {
                                   ve.setIdmatier(0);
                               }
                           }
                           )));
       matiers.remove(idMatier);
    }

    public void rechercheMatier(String search){
        matiers.forEach((key,value) -> {
            if (value.getName().equals(search) || value.getDescription().equals(search)){
                System.out.println(key + " = " + value);
            }
        });
    }

    public void addEtudiant(String anneeEntree, String lastName, String firstName, String email, String phone, String password, String status){
        Etudiant etudiant = new Etudiant(anneeEntree,lastName,firstName,email,phone,password,status);
        etudiants.put(etudiant.getId(),etudiant);
    }

    public void editEtudint(int idEtudiant,int update,String newValue){
        switch (update){
            case 1 : etudiants.get(idEtudiant).setAnneeEntree(newValue);
                break;
            case 2 : etudiants.get(idEtudiant).setLastName(newValue);
                break;
            case 3 : etudiants.get(idEtudiant).setFirstName(newValue);
                break;
            case 4 : etudiants.get(idEtudiant).setEmail(newValue);
                break;
            case 5 : etudiants.get(idEtudiant).setPhone(newValue);
                break;
            case 6 : etudiants.get(idEtudiant).setPassword(newValue);
                break;

        }
    }

    public void getAllEtudiant(){
        etudiants.forEach((key,value) -> System.out.println(key + " = " + value));
    }

    public void rechercheEtudiant(String search){
        etudiants.forEach((key,value) -> {
            if(value.email== search || value.firstName == search || value.lastName == search || value.phone == search){
                System.out.println(key + " = " + value);
            }
        });
    }

    public void removeEtudiant(int idEtudiant){
        etudiants.remove(idEtudiant);
    }

    public void aseignerMatierEtudiant(int idEtudiant,int idMatier){
        Matier matier = matiers.get(idMatier);
        etudiants.get(idEtudiant).setMatiers(matier,idMatier);
    }





    public void addEvaluation(int idEtudiant,int idMatier,String date,double note){
        Evaluation evaluation = new Evaluation(idMatier,date,note);
        etudiants.get(idEtudiant).getEvaluations().put(evaluation.getId(),evaluation);
    }

    public void editEvaluation(int idEtudiant,int idEvaluation,double newNote){
        etudiants.get(idEtudiant).getEvaluations().get(idEvaluation).setNote(newNote);
    }

    public void allEvaluationParMatier(int idEtudiant,int idMAtier){
        etudiants.get(idEtudiant).getEvaluations().forEach((key,value) ->
                {
                    if (value.getId_matier() == idMAtier) {
                        matiers.forEach((km,vm) -> {
                            if (km.equals(idMAtier)){
                                System.out.println(key + " = " + vm.getName() + "  " + value.getDate() + "    " + value.getNote());
                            }
                        });
                    }
                }

                );
    }

    public void removeEvualution(int idEtudiant,int idEvualution){
        etudiants.get(idEtudiant).getEvaluations().remove(idEvualution);
    }

    public double moyenOfNoteDepartement(int idCollege,int idDepartement) {
        final double[] note = {0, 0};
        double moyenNote = 0;
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().forEach((key,value) ->{
        etudiants.forEach((ke,ve)->{
            System.out.println("kjgjgc");
            ve.getEvaluations().forEach((keyEv,valueEv) ->{

                if (value.getIdmatier() == valueEv.getId_matier()){
                    note[0] += valueEv.getNote();
                    note[1]++;
                }

            });
        });
        });
        moyenNote = note[0]/note[1];
        return moyenNote;
    }

    public double moyenOfNoteParMatier(int idMatier){
        final double note[] = {0,0};
        double moyenNote = 0;
        etudiants.forEach((key,value) -> {
            value.getEvaluations().forEach((keyEv,valEv)->{
                if (valEv.getId_matier() == idMatier){
                    note[0]+= valEv.getNote();
                    note[1]++;
                }
            });
        });
        moyenNote = note[0]/note[1];
        return moyenNote;
    }

    public double moyenNoteParEtudiant(int idEtudiant){
        final double note[] = {0,0};
        double moyenNote = 0;
        etudiants.get(idEtudiant).getEvaluations().forEach((key,value)->{
            note[0] += value.getNote();
            note[1]++;
        });
        moyenNote = note[0]/note[1];
        return moyenNote;
    }

    public void MatierPasNote(int idEtudiant){
        etudiants.get(idEtudiant).getEvaluations().forEach((key,value)->{
            etudiants.get(idEtudiant).getMatiers().forEach((keym,valuem)->{
                if (value.getId_matier() != keym){
                    System.out.println(keym + " = " + valuem.getName());
                }
            });
        });
    }

}


