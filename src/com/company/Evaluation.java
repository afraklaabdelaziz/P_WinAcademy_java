package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Evaluation {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private int id_matier;
    private String date;
    private double note;

    public Evaluation(){}
    public Evaluation(int id_matier, String date, double note) {
        this.id = _ID.incrementAndGet();
        this.id_matier = id_matier;
        this.date = date;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_matier() {
        return id_matier;
    }

    public void setId_matier(int id_matier) {
        this.id_matier = id_matier;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", id_matier=" + id_matier +
                ", date='" + date + '\'' +
                ", note=" + note +
                '}';
    }
}
