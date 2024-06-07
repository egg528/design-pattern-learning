package org.example.iterator;

import java.util.Iterator;

/**
 * Waitress
 */
public class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("아침 식사 메뉴 리스트!");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("\n저녁 식사 메뉴 리스트!");
        printMenu(dinerMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.printf("메뉴 이름: %s, 가격: %s, 설명: %s \n", item.name(), item.price(), item.name());
        }
    }
}
