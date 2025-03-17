package java_method_parameters;

import java.util.*;

public class Main {
   public static void guessNumber(int guess, int matchRand) {
       if (guess == matchRand) {
           System.out.println("Congratulations! You guessed the number! " + guess);
       } else if (guess > matchRand) {
           System.out.println("Try again! Too high! " + guess);
       } else if (guess < matchRand) {
           System.out.println("Try again! Too low! " + guess);
       }
   }

   public static void main(String[] args) {
       int max = 100;
       int min = 1;
       int randN = max - min + 1;
       int matchRand = (int)(Math.random() * randN) + min; 

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your guess 1: ");
       int g = sc.nextInt();
       System.out.println("Enter your guess 2: ");
       int g2 = sc.nextInt();
       System.out.println("Enter your guess 3: ");
       int g3 = sc.nextInt();

       guessNumber(g, matchRand);  
       guessNumber(g2, matchRand);
       guessNumber(g3, matchRand);

       sc.close();  
   }
}
