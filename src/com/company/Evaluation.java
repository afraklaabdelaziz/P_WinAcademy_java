package com.company;

public class Evaluation {
    public int id_student;
    public int id_matier;
    public String date;
    public double note;

    public Evaluation(int id_student, int id_matier, String date, double note) {
        this.id_student = id_student;
        this.id_matier = id_matier;
        this.date = date;
        this.note = note;
    }
}
