package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
        this.temperature = -1;
        this.humidity = -1;
        this.pressure = -1;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (!isAllSetup()) {
            throw new IllegalStateException("기상 데이터가 준비되지 않았습니다.");
        }

        // Push 방식
        // observers.forEach(observer -> observer.update(temperature, humidity, pressure));

        // Pull 방식
        observers.forEach(Observer::update);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private boolean isAllSetup() {
        return temperature != -1 && humidity != -1 && pressure != -1;
    }


}
