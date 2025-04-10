package java_date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birthday (dd-MM-yyyy): ");
        String birthdayInput = scanner.nextLine();

        DateTimeFormatter birthdayFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdayDate = LocalDate.parse(birthdayInput, birthdayFormatter);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss");
        String formattedNow = now.format(dateTimeFormatter);

        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthdayDate.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        if (daysUntilBirthday == 0) {
            System.out.println("🎉 Happy Birthday, " + name + "! 🎉");
        } else {
            System.out.println("Days until your birthday: " + daysUntilBirthday);
        }

        System.out.println("\nHello, " + name + "!");
        System.out.println("Today is: " + formattedNow);
        System.out.println("Your birthday is on: " + nextBirthday.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        System.out.println("Days until your birthday: " + daysUntilBirthday);
        scanner.close();
    }
}
