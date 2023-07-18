package evenorodd;

import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void nothing(){}

    /*
    evenOrOdd(3) → odd
    evenOrOdd(2) → even
    evenOrOdd(15) → odd
    evenOrOdd(24) → even

     */
    @Test
    public void givenThree_returnsOdd() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String givenThree = evenOrOdd.findEvenOdd(3);
        assertEquals("Odd", givenThree);
    }
}
