package org.example.sngleton;

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }

        return instance;
    }
}
