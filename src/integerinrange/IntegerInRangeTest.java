package integerinrange;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {

    private IntegerInRange integerInRange = new IntegerInRange();

    @Test
    public void nothing() {}


    /*intWithinBounds(3, 1, 9) ➞ true
    intWithinBounds(6, 1, 6) ➞ false
    intWithinBounds(3, 3, 8) ➞ true
    intWithinBounds(8, 8, 10) ➞ true
    intWithinBounds(10, 66, 87) ➞ false*/

    @Test
    public void givenThreeOneAndNine_returnsTrue() {
        boolean givenThreeOneAndNine = integerInRange.findIntWithinBounds(3, 1, 9);
        assertEquals(true, givenThreeOneAndNine);
    }

    @Test
    public void givenSixOneAndSix_returnsFalse() {
        boolean givenSixOneAndSix = integerInRange.findIntWithinBounds(6, 1, 6);
        assertEquals(false, givenSixOneAndSix);
    }

    @Test
    public void givenThreeThreeAndEight_returnsTrue() {
        boolean givenThreeThreeAndEight = integerInRange.findIntWithinBounds(3, 3, 8);
        assertEquals(true, givenThreeThreeAndEight);
    }
}
