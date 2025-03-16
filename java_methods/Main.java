package java_methods;

public class Main {
    static float calculateArea(float length,float width){
        float area = length * width;
        return area;
    }
    public static void main(String[]args){
       float res = calculateArea(5f, 10f);
       System.out.println(res);
    }    
}
