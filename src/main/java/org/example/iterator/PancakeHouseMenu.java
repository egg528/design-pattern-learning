package org.example.iterator;

import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem(new MenuItem("초코 케이크", "녹진한 초코 케이크", 5000));
        addItem(new MenuItem("딸기 케이크", "상큼한 딸기 케이크", 4000));
    }

    public void addItem(MenuItem menuItem) {
        if (MAX_ITEMS <= numberOfItems) {
            System.err.println("메뉴가 가득 찼습니다.");
            return;
        }

        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
