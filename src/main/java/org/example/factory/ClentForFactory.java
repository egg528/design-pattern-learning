package org.example.factory;

import org.example.factory.enums.PizzaType;
import org.example.factory.store.NewYorkPizzaStore;
import org.example.factory.store.PizzaStore;
import org.example.factory.store.SeoulPizzaStore;

import static org.example.factory.enums.PizzaType.BASIC;
import static org.example.factory.enums.PizzaType.CHEESE;

public class ClentForFactory {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        newYorkPizzaStore.orderPizza(CHEESE);
        System.out.println();
        newYorkPizzaStore.orderPizza(BASIC);
        System.out.println();
        System.out.println();

        PizzaStore seoulPizzaStore = new SeoulPizzaStore();
        seoulPizzaStore.orderPizza(CHEESE);
        System.out.println();
        seoulPizzaStore.orderPizza(BASIC);
    }
}
