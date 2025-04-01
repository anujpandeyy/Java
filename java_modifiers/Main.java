package java_modifiers;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.make = "Tesla";
        System.out.println(obj.startEngine());
        System.out.println(obj.drive());
        System.out.println(obj.displayInfo());

    }
}

class Car {
    public String make;
    private String model = "Model X";
    final int year = 2025;
    static int speed = 0;

    public String startEngine() {
        return "Engine started!";
    }

    protected int drive() {
        return speed += 10;
    }

    String displayInfo() {
        return make + " " + model + " " + year;
    }

}
