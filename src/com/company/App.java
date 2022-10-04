package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class App {
    private College college;
     private static HashMap<Integer,College> colleges = new HashMap<>();
     private HashMap<Integer,Matier> matiers = new HashMap<>();
     private HashMap<Integer,Etudiant> etudiants = new HashMap<>();


    public void addCollege(int numero,String nom,String site){
        college = new College(numero, nom, site);
         colleges.put(numero,college);
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

     public void addDepartement(int id, String name, String description,int idCollege){
        Departement departement = new Departement(id,name,description);
            colleges.get(idCollege).getDepartements().put(id,departement);
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

    public void addAdress(int id,String ville,String pays,String adress,String codePostal,int idCollege) {
        colleges.get(idCollege).addAdress(id, ville, pays, codePostal, adress);
  }

  public void addEnsiegnant(int id,String date, String lastName, String firstName, String email, String phone, String password, String status,int idCollege,int idDepartement){
        Enseignant enseignant = new Enseignant(id,date,lastName,firstName,email,phone,password,status);
        colleges.get(idCollege).getDepartements().get(idDepartement).getEnseignant().put(id,enseignant);
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

    public void addMatier(int id,String name,String description){
        Matier matier = new Matier(id,name,description);
        matiers.put(id,matier);
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
                               if (ve.equals(idMatier)) {
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

    public void addEtudiant(int id,String anneeEntree, String lastName, String firstName, String email, String phone, String password, String status){
        Etudiant etudiant = new Etudiant(id,anneeEntree,lastName,firstName,email,phone,password,status);
        etudiants.put(id,etudiant);
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
        etudiants.forEach((key,value)-> System.out.println(key + " = " + value));
    }





    public void addEvaluation(int idEvaluation,int idEtudiant,int idMatier,String date,double note){
        Evaluation evaluation = new Evaluation(idEvaluation,idMatier,date,note);
        etudiants.get(idEtudiant).getEvaluations().put(idMatier,evaluation);
    }

    public void editEvaluation(int idEtudiant,int idEvaluation,double newNote){
        etudiants.get(idEtudiant).getEvaluations().get(idEvaluation).setNote(newNote);
    }

    public void allEvaluationParMatier(int idEtudiant,int idMAtier){
        etudiants.get(idEtudiant).getEvaluations().forEach((key,value) ->
                {
                    if (value.getId_matier() == idMAtier) {
                        System.out.println(key + " = " + value);
                    }
                }

                );
    }

    public void removeEvualution(int idEtudiant,int idEvualution){
        etudiants.get(idEtudiant).getEvaluations().remove(idEvualution);
    }

  public void updateAdress(int id,String ville,String pays,String adress,String codePostal,int idCollege){

  }
     }


