package org.example.factory.pizza;

import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private final Cheese cheese;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory.createDough(), ingredientFactory.createSauce());
        this.name =  "%s 꼬소한 치즈 피자".formatted(ingredientFactory.getStyle());
        this.cheese = ingredientFactory.createCheese();
    }

    @Override
    public void prepare() {
        System.out.println(name + ": 피자를 준비 중입니다...");
        System.out.println(dough.getName() + ": 도우를 돌리고...");
        System.out.println(sauce.getName() + ": 소스를 뿌리고...");
        System.out.println(cheese.getName() + ": 치즈 피자에는 치즈를 뿌려야죠...");
    }
}
