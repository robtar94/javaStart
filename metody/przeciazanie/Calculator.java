package metody.przeciazanie;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return add(a,b) + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return subtract(a,b) - c;
    }
}
