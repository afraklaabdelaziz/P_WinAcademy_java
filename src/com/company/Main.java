package com.company;

public class Main {

    public static void main(String[] args) {

College college1 = new College(1,"youcode youssoufia","youcode.ma");
college1.addDeparetements(3,"informatique","info");
        college1.addDeparetements(4,"informatique","info");
        college1.addDeparetements(5,"informatique","info");
        college1.addAdress(1,"youssoufia","maroc","1234","l3rsa");
        System.out.println(college1.toString());
        System.out.println(college1.chercherDeparetement(5));

        Departement departement = new Departement(6,"informatique","info");
        departement.addEnseignant(1,"12/03/2022","abdelaziz","afrakla","afrakla@gmail.com","0639616681","aafrakla","1");
        departement.addEnseignant(2,"12/03/2022","abdelaziz","afrakla","afrakla@gmail.com","0639616681","aafrakla","1");
        departement.addEnseignant(3,"12/03/2022","abdelaziz","afrakla","afrakla@gmail.com","0639616681","aafrakla","1");
        departement.addEnseignant(4,"12/03/2022","abdelaziz","afrakla","afrakla@gmail.com","0639616681","aafrakla","1");
        departement.removeEnseignant(1);
        System.out.println(departement.toString());
        System.out.println(departement.rchercheEnseignant(2));


    }
}
