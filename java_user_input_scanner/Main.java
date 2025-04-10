package java_user_input_scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String grade;
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter 5 exam scores:");
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            marks[i] = temp;
        }
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double avg = (double) sum / marks.length;
        if (avg >= 90 && avg <= 100) {
            grade = "A";
        } else if (avg >= 80 && avg <= 89) {
            grade = "B";
        } else if (avg >= 70 && avg <= 79) {
            grade = "C";
        } else if (avg >= 60 && avg <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Student: " + name);
        System.out.println("Scores: " + Arrays.toString(marks));
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
