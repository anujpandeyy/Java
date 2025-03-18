package java_method_overloading;

public class Main {

    static int multiplyMethod(int x,int y){
        return x*y;
    }
    static float multiplyMethod(float x,float y){
        return x*y;
    }
    static int multiplyMethod(int x,int y,int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        System.out.println(multiplyMethod(5, 4));
        System.out.println(multiplyMethod(5.5f, 4.4f));
        System.out.println(multiplyMethod(10, 20, 30));
    }
}
