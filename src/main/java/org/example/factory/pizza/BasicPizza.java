package org.example.factory.pizza;

import org.example.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.name =  "%s 꼬소한 치즈 피자".formatted(ingredientFactory.getStyle());
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
    }

    @Override
    void prepare() {
        System.out.println(name + " 피자를 준비 중입니다...");
        System.out.println(dough + " 도우를 돌리고...");
        System.out.println(sauce + " 소스를 뿌리고...");
    }
}
