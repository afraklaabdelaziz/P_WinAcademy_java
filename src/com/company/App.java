package com.company;

import java.util.HashMap;

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

    public void rechercheMatier(){

    }

  public void updateAdress(int id,String ville,String pays,String adress,String codePostal,int idCollege){

  }
     }


