package java_abstraction;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        c.startEngine();
        c.stopEngine();
        m.startEngine();
        m.stopEngine();
    }
}

abstract class Vehicle {
    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("The engine has stopped.");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts with a key.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine roars to life!");
    }
}