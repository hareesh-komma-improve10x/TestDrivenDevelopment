package positivenegativezero;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveNegativeZeroTest {

    private PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();

    /*
    positiveNegativeOrZero = 99 -> positive
    positiveNegativeOrZero = -88 -> negative
    positiveNegativeOrZero = -2 -> negative
    positiveNegativeOrZero = 0 -> zero
     */
    @Test
    public void givenPositive() {
        String givenPositive = positiveNegativeZero.findPositiveNegativeOrZero(99);
        assertEquals("Positive", givenPositive);
    }

    @Test
    public void givenNegative() {
        String givenNegative = positiveNegativeZero.findPositiveNegativeOrZero(-88);
        assertEquals("Negative", givenNegative);
    }

    @Test
    public void givenZero() {
        String givenZero = positiveNegativeZero.findPositiveNegativeOrZero(-2);
        assertEquals("Negative", givenZero);
    }
}
