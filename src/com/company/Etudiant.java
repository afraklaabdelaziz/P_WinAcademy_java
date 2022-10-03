package com.company;

import java.util.HashMap;

public class Etudiant extends User {
    private int id;
    private String anneeEntree;
    private HashMap<Integer,Evaluation> evaluations = new HashMap<>();

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

    public void setEvaluations(HashMap<Integer, Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public Etudiant(int id,String anneeEntree, String lastName, String firstName, String email, String phone, String password, String status) {
        super(id, lastName, firstName, email, phone, password, status);
        this.id = id;
        this.anneeEntree = anneeEntree;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", anneeEntree='" + anneeEntree + '\'' +
                ", evaluations=" + evaluations +
                '}';
    }
}
