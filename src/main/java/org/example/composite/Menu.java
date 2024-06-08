package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> menuComponents;
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println(getName() + ": " + getDescription());
        System.out.println("---------------------------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
