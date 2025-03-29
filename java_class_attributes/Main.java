package java_class_attributes;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.car = "BMW";
        car.year = 2015;
        System.out.println("Car is " + car.car + " " + "year is" + " " + car.year);
        car.year = 2022;
        System.out.print("Car is " + car.car + " " + "year is" + " " + car.year);
    }
}

class Car {
    String car;
    int year;
}