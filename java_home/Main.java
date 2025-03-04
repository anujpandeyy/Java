import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd num:");
        int n2 = sc.nextInt();
        
        float sum = n1+n2;

        System.out.println(sum);
        
    }
}