package metody;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc godzin, ktora chcesz zamienic na minuty:");

        int hours = scanner.nextInt();
        int inMinutes = timeConverter.hoursToMinutes(hours);
        int inSeconds = timeConverter.minutesToSeconds(inMinutes);
        int fromSecondsToMinutes = timeConverter.secondsToMinutes(inSeconds);

        System.out.println(hours + " godzin to: " + inMinutes + " minut.");
        System.out.println(inMinutes +" minut to: " + inSeconds + " sekund." );
        System.out.println(inSeconds +" sekund to: " + fromSecondsToMinutes +" minut.");
    }
}
