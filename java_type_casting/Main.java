package java_type_casting;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
    int a,b;
    float area;
    Scanner sc = new Scanner(System.in);
    System.out.println("Length");
    a = sc.nextInt();
    System.out.println("Width");
    b = sc.nextInt();
    area = (float)(a*b);
    System.out.println("The area of the rectangle is "+area);
    sc.close();
   }
}
