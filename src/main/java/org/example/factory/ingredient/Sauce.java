package org.example.factory.ingredient;

public abstract class Sauce {
    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
