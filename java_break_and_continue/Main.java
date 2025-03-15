package java_break_and_continue;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
            if (i == 15) {
                break;
            }
        }
    }
}
