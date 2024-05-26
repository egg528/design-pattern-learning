package org.example.factory.ingredient;

public abstract class PizzaIngredientFactory {
    protected final String style;

    public PizzaIngredientFactory(String style) {
        this.style = style;
    }

    public abstract Dough createDough();

    public abstract Sauce createSauce();

    public abstract Cheese createCheese();

    public String getStyle() {
        return style;
    }
}
