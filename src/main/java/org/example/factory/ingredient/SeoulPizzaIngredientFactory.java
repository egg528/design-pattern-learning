package org.example.factory.ingredient;

public class SeoulPizzaIngredientFactory extends PizzaIngredientFactory{
    public SeoulPizzaIngredientFactory() {
        super("서울");
    }

    @Override
    public Dough createDough() {
        return new SeoulStyleDough();
    }

    @Override
    public Sauce createSauce() {
        return new SeoulStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SeoulStyleCheese();
    }
}
