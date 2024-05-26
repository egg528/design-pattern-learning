package org.example.factory.ingredient;

public class NewYorkPizzaIngredientFactory extends PizzaIngredientFactory{
    public NewYorkPizzaIngredientFactory() {
        super("뉴욕");
    }

    @Override
    public Dough createDough() {
        return new NewYorkStyleDough();
    }

    @Override
    public Sauce createSauce() {
        return new NewYorkStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NewyorkStyleCheese();
    }
}
