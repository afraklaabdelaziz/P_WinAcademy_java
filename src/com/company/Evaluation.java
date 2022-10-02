package com.company;

public class Evaluation {
    private int id_student;
    private int id_matier;
    private String date;
    private double note;

    public Evaluation(int id_student, int id_matier, String date, double note) {
        this.id_student = id_student;
        this.id_matier = id_matier;
        this.date = date;
        this.note = note;
    }
}
