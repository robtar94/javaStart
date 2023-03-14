package zmienne;

import java.util.Random;

// program generuje dwie dowolne liczby z zakresu od 1 do 100 przy uzyciu biblioteki Random,
// a nastepnie je porownuje.
public class RandomizeIntegers {
    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args) {
        // generowanie liczb

        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int result = r.nextInt(upperBound - lowerBound) + lowerBound; // lub  result = r.nextInt(101);
        int result2 = r.nextInt(101);

        int x = result;
        int y = result2;

        //sprawdzenie

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Pytania
        System.out.println("Czy x jest większe od y?");
        System.out.println(x > y);
        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        System.out.println((x * 2) > y);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(y < (x + 3) && y > (x - 2));
        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)");
        System.out.println((x * y) % 2 == 0); // jesli modulo daje 0 to nie ma reszty.


    }
}
