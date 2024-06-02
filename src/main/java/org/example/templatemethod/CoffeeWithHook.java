package org.example.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    protected boolean isNeedCondiments() {
        String answer = null;

        System.out.println("Do you want milk and sugar? (y/n)");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            answer = reader.readLine();
        } catch (IOException e) {
            System.err.println("IO Exception");
        }

        return "y".equals(answer);
    }
}
