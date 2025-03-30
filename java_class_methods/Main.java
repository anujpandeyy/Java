package java_class_methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: "+Calculator.add(10, 5));
        System.out.println("Subtraction: "+Calculator.subtract(10, 5));
        System.out.println("Multiplication: "+Calculator.multiply(10, 5));
        System.out.println("Division: "+Calculator.divide(10, 5));
    }    
}

class Calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }
}