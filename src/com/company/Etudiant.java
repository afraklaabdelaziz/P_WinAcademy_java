package com.company;

import java.util.HashMap;

public class Etudiant extends User {
    private String anneeEntree;
    private HashMap<Integer,Evaluation> evaluations = new HashMap<>();
    private HashMap<Integer,Matier> matiers = new HashMap<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnneeEntree() {
        return anneeEntree;
    }

    public void setAnneeEntree(String anneeEntree) {
        this.anneeEntree = anneeEntree;
    }

    public HashMap<Integer, Evaluation> getEvaluations() {
        return evaluations;
    }

    public HashMap<Integer, Matier> getMatiers() {
        return matiers;
    }

    public void setMatiers(Matier matier,int idMatier) {
        this.matiers.put(idMatier,matier);
    }

    public void setEvaluations(HashMap<Integer, Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public Etudiant(String anneeEntree, String lastName, String firstName, String email, String phone, String password, String status) {
        super(lastName, firstName, email, phone, password, status);
        this.anneeEntree = anneeEntree;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", anneeEntree='" + anneeEntree + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", evaluations=" + evaluations +
                ", matiers=" + matiers +
                '}';
    }
}
