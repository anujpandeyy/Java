package java_switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Month No: ");
        Scanner sc = new Scanner(System.in);
        int userNo = sc.nextInt();
        switch (userNo) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Fall");
                break;
        }
        sc.close();
    }
}
