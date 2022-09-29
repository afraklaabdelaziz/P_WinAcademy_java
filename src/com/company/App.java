package com.company;

import java.util.HashMap;

public class App {
    College college;
     static HashMap<Integer,College> colleges = new HashMap<Integer,College>();

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
    public void removeCollege(int numero){
        colleges.remove(numero);
    }

     public void addDepartement(int id, String name, String description,int idCollege){
        Departement departement = new Departement(id,name,description);
            colleges.get(idCollege).departements.put(id,departement);
     }

     public void getAllDepartement(int idCollege){
        colleges.get(idCollege).departements.forEach((key,value) -> System.out.println(key + " = " + value));
     }

     public void getDepartement(int idCollege,int idDepartement){
         System.out.println(colleges.get(idCollege).departements.get(idDepartement));
     }

     public void removeDepartement(int idCollege,int idDepartement){
        colleges.get(idCollege).departements.remove(idDepartement);
     }

    public void addAdress(int id,String ville,String pays,String adress,String codePostal,int idCollege) {
        colleges.get(idCollege).addAdress(id, ville, pays, codePostal, adress);
  }

  public void addEnsiegnant(int id,String date, String lastName, String firstName, String email, String phone, String password, String status,int idCollege,int idDepartement){
        Enseignant enseignant = new Enseignant(id,date,lastName,firstName,email,phone,password,status);
        colleges.get(idCollege).departements.get(idDepartement).enseignant.put(id,enseignant);
  }

  public void getAllEnseignant(int idCollege,int idDepartement){
        colleges.get(idCollege).departements.get(idDepartement).enseignant.forEach((key,value) -> System.out.println(key + " = " + value));
  }

    public void getEnseignant(int idCollege,int idDepartement,int idEnseignant){
        System.out.println(colleges.get(idCollege).departements.get(idDepartement).enseignant.get(idEnseignant));
    }

    public void removeEnseignant(int idCollege,int idDepartement,int idEnseignant){
        colleges.get(idCollege).departements.get(idDepartement).enseignant.remove(idEnseignant);
    }

  public void updateAdress(int id,String ville,String pays,String adress,String codePostal,int idCollege){

  }
     }


