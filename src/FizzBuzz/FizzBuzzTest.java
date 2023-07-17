package FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private fizzbuzz.FizzBuzz fizzBuzz;

    @BeforeEach
    private void setUp() {
        fizzBuzz = new fizzbuzz.FizzBuzz();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void findFizzBuzz() {
        String fizzBuzz1 = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz",fizzBuzz1 );
    }

    @Test
    public void findOnlyFizz() {
        String fizz = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz",fizz);
    }

    @Test
    public void findOnlyBuzz() {
        String buzz = fizzBuzz.findFizzBuzz(20);
        assertEquals("Buzz",buzz);
    }

    @Test
    public void returnNValue() {
        String buzz = fizzBuzz.findFizzBuzz(1);
        assertEquals(buzz, buzz);
    }
}


