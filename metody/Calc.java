package metody;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie kalkulator!");
        System.out.println("Podaj dwie liczby i potwierdz enterem: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Calculator calc = new Calculator();
        System.out.println("Dodawanie: " + a + " + " + b + " = " + calc.add(a,b));
        System.out.println("Odejmowanie: " + a + " - " + b + " = " + calc.subtract(a,b));
        System.out.println("Mnożenie: " + a + " * " + b + " = " + calc.multiply(a,b));
        System.out.println("Dzielenie: " + a + " / " + b + " = " + calc.divide(a,b));






    }
}
