package java_inheritance;

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "IDK";
        obj.breed = "IDK";
        obj.makeSound();
        System.out.println(obj.name + " " + obj.breed);
    }
}

class Animal {
    protected String name;

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    String breed;

    @Override
    public void makeSound() {
        System.out.println("Woof, woof!");
    }
}