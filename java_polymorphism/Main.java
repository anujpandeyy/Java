package java_polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        Bicycle b1 = new Bicycle();
        Boat b2 = new Boat();
        v1.move();
        c1.move();
        b1.move();
        b2.move();

    }
}

class Vehicle {
    public void move() {
        System.out.println("The vehicle moves.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on the road.");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bicycle pedals forward.");
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("The boat sails on the water.");
    }
}