import java.util.ArrayList;
import java.util.List;

// Observable interface
interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Observable
class WeatherStation implements Observable {
    private int temperature;
    private List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer interface
interface Observer {
    void update(int temperature);
}

// Concrete Observer
class Display implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        displayTemperature();
    }

    public void displayTemperature() {
        System.out.println("Current Temperature: " + temperature);
    }
}

public class Solution {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display();
        Display display2 = new Display();

        // Add observers
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Update temperature
        weatherStation.setTemperature(25);

        // Output:
        // Current Temperature: 25
        // Current Temperature: 25
    }
}
