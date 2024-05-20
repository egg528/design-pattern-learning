package org.example.decorator;

import org.example.decorator.custom.io.LowerCaseInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClientForDecorator {
    public static void main(String[] args) {
        Beverage espressoWithMocha = new Mocha(new Espresso());
        System.out.println(espressoWithMocha.getDescription());
        System.out.println(espressoWithMocha.cost());

        Beverage darkRoastWithMochaAndCream = new Cream(new Mocha(new DarkRoast()));
        System.out.println(darkRoastWithMochaAndCream.getDescription());
        System.out.println(darkRoastWithMochaAndCream.cost());

        String text = "Hello My Name Is Woosuk";
        try (InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(text.getBytes()))) {
            int data;
            while ((data = in.read()) != -1) {
                // 콘솔에 출력
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
