package java_enums;

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Weekday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}