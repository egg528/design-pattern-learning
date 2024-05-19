package org.example.observer;

public interface Observer {
    // Push 방식
    // void update(float temperature, float humidity, float pressure);

    // Pull 방식
    void update();
}
