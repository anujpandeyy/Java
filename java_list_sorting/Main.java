package java_list_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter fruit name " + i + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        Collections.sort(fruits);

        System.out.println("\nSorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}
