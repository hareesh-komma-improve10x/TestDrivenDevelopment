package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumber_returnsNegativeNumber() {
        int negativeFibonacci = fibonacci.findNthNumber(-42);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeNumber() {
        int negativeFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenOne_returnsZero() {
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0, firstFibonacci);
    }

    @Test
    public void givenTwo_returnsOne() {
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1, secondFibonacci);
    }

    @Test
    public void givenThree_returnsOne() {
        int threeFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1, threeFibonacci);
    }

    @Test
    public void givenSix_returnsThree() {
        int fiveFibonacci = fibonacci.findNthNumber(5);
        assertEquals(3, fiveFibonacci);
    }
}