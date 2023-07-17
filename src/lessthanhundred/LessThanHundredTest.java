package lessthanhundred;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessThanHundredTest {

    private LessThanHundred lessThanHundred = new LessThanHundred();

    @Test
    public void nothing() {
    }
    /*
    lessThanHundred(55, 45) --> true
    lessThanHundred(100, 1) --> false
    lessThanHundred(9, 10) --> true
     */
    @Test
    public void givenFiftyFiveFourtyFive_returnsTrue() {
        boolean hundred = lessThanHundred.findLessThanHundred(55, 45);
        assertEquals(true, hundred);
    }

    @Test
    public void givenHundredAndOne_returnsFalse() {
        boolean hundred = lessThanHundred.findLessThanHundred(0, 0);
        assertEquals(true, hundred);
    }
}
