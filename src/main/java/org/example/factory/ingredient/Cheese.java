package org.example.factory.ingredient;

public abstract class Dough {
    private String name;

    public Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
