package org.example.observer;

public class TestForObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentCondition = new CurrentConditionDisplay(weatherData);
        DisplayElement statistics = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(30, 62, 30.1f);
        System.out.println();
        weatherData.setMeasurements(31, 61, 30.2f);
        System.out.println();
        weatherData.setMeasurements(32, 62, 33.2f);
    }
}
