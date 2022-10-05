package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Matier {
    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Matier(String name, String description) {
        this.id = _ID.incrementAndGet();
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Matier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
