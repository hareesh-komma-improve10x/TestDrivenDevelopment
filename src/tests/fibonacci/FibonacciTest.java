package fibonacci;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumber_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-42);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1, negativeFibonacci);
    }

}
