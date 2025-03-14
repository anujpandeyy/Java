package java_if_else;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int user = sc.nextInt();
        if(user%4==0){
            if(user%100==0){
                if(user%400==0){
                    System.out.println("Leap Year "+user);
                }
                else{
                    System.out.println("Not a Leap Year "+user);
                }
            }else{
                System.out.println("Leap Year "+user);
            }
        }else{
            System.out.println("Not a Leap Year "+user);
        }
        sc.close();
    }
}
