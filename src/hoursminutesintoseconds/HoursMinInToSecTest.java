package hoursminutesintoseconds;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoursMinInToSecTest {

    private HoursMinInToSec hoursMinInToSec = new HoursMinInToSec();

    /*convert(1, 3) ➞ 3780
    convert(2, 0) ➞ 7200
    convert(0, 0) ➞ 0
    convert(3, 6) → 11160*/


    @Test
    public void givenOneThree_return3780() {
        int returns3780 = hoursMinInToSec.convertHoursMinInToSec(1, 3);
        assertEquals(3780, returns3780);
    }

    @Test
    public void givenTwoAndZero_return7200() {
        int returns7200 = hoursMinInToSec.convertHoursMinInToSec(2, 0);
        assertEquals(7200, returns7200);
    }

    @Test
    public void givenZeroAndZer0_returnZero() {
        int returnsZero = hoursMinInToSec.convertHoursMinInToSec(0, 0);
        assertEquals(0, returnsZero);
    }
}
