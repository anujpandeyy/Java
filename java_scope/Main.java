package java_scope;

public class Main {

    static int calculateSum(int x,int y){
        return x+y;
    }

    static int calculateProduct(int x,int y){
        return x*y;
    }

    public static void main(String[] args) {
        int x = 50;
        System.out.println(calculateSum(x, 10));
        System.out.println(calculateProduct(x, 10));
    }
}
