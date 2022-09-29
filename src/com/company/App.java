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
        colleges.get(numero);
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

     public void addDepartement(int id, String name, String description){
        Departement departement = new Departement(id,name,description);
            college.departements.put(id,departement);
     }

     }


