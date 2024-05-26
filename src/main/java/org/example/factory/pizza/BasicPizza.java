package org.example.factory.pizza;

import org.example.factory.ingredient.PizzaIngredientFactory;

public class BasicPizza extends Pizza {
    public BasicPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory.createDough(), ingredientFactory.createSauce());
        this.name =  "%s 기본 피자".formatted(ingredientFactory.getStyle());
    }

    @Override
    public void prepare() {
        System.out.println(name + " 피자를 준비 중입니다...");
        System.out.println(dough.getName() + " 도우를 돌리고...");
        System.out.println(sauce.getName() + " 소스를 뿌리고...");
    }
}
