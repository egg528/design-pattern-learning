package org.example.composite;

public class MenuItem extends MenuComponent {
    private final String name;
    private final String description;
    private final double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(getName() + ": " + getDescription() + " " + getPrice());
    }
}
