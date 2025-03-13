package java_math;
public class Main {
    public static void main(String[]args){
        int min = 50;
        int max = 200;
        int range = max-min+1;

        int randNum = (int) (Math.random()*range)+min;
        double sqr =  Math.sqrt(randNum);
        System.out.println(sqr);
        System.out.println(Math.max((double)randNum, sqr)); 
    }
}
