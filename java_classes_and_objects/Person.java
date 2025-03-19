package java_classes_and_objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anuj", 22);
        Person p2 = new Person("Arjun", 21);
        p1.introduce();
        p2.introduce();
    }
}
