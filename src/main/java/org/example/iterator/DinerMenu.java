package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DinerMenu implements Menu {
    private final List<MenuItem> menuItems;

    public DinerMenu() {
        menuItems = new ArrayList<>();
        addItem(new MenuItem("우동", "기계식 우동", 3000));
        addItem(new MenuItem("라면", "신라면", 2500));
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
