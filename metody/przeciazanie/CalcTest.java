package metody.przeciazanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SuppressWarnings("SameParameterValue")
public class CalcTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add two variables test:")
    void addTwoIntegersTest() {
        assertEquals(3, calculator.add(2,1), "add 2 and 1 should be 3");
    }

    @Test
    @DisplayName("add three integers test")
    void addThreeIntegersTest() {
        assertEquals(15, calculator.add(7,3,5), "adding 7 and 3 should be 10!");
    }

    @Test
    void subtractTwoIntegers() {
        assertEquals(-3, calculator.subtract(10,13), "10 minus 13 should be -3!");
    }

    @Test
    void subtractThreeIntegers() {
        assertEquals(0, calculator.subtract(10,3,7), "10 minus 3 minus 7 should be 0!");
    }
}
