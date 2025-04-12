package java_linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addLast("John");
        students.addLast("Emma");
        students.addLast("Liam");
        students.addLast("Olivia");
        students.addLast("Mike");

        students.addFirst("Alice");
        students.removeLast();
        students.set(1, "Sarah");

        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        System.out.println("Full student list: " + students);
    }
}
