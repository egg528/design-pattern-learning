package org.example.templatemethod;

/**
 * TemplateMethod Pattern Example
 * @see java.util.Arrays#mergeSort(Object[], Object[], int, int, int)
 */
public class ClientForTemplateMethod {
    public static void main(String[] args) {
        CaffeineBeverageWithHook template = new CoffeeWithHook();

        template.prepareRecipe();
    }
}
