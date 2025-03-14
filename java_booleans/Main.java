package java_booleans;
import java.util.*;
public class Main{
    public static void main(String[]args){
        int age;
        boolean passedTest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Have you passed the driving test? (true/false): ");
        passedTest = sc.nextBoolean();
        if(age>=18 && passedTest){
            System.out.println("Eligible for a driver's license");
        }else{
            System.out.println("Not eligible for a driver's license");
        }
        sc.close();
    }
}