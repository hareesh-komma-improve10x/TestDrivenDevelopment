package minutesintoseconds;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesIntoSecondsTest {

    private MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();

    @Test
    public void nothing() {
    }

    /*
    convert(3) ➞ 180
    convert(2) ➞ 120
    convert(21) ➞ 1260
     */
    @Test
    public void givenThree_returnsOneEightyseconds() {
        int minIntoSeconds = minutesIntoSeconds.convertMinIntoSeconds(3);
        assertEquals(180, minIntoSeconds);
    }

    @Test
    public void givenTwo_returnsOneTwentySeconds() {
        int minIntoSeconds = minutesIntoSeconds.convertMinIntoSeconds(2);
        assertEquals(120, minIntoSeconds);
    }

    @Test
    public void givenTwentyOne_returns1260() {
        int minIntoSeconds = minutesIntoSeconds.convertMinIntoSeconds(21);
        assertEquals(1260, minIntoSeconds);
    }
}
