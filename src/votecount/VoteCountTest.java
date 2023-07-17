package votecount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoteCountTest {

    private VoteCount voteCount = new VoteCount();

    @Test
    public void givenZeros_returnZero() {
        int returnZero = voteCount.voteCount(0, 0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenNegativeNumbers_returnMinusOne() {
        int returnMinusOne = voteCount.voteCount(-9, -10);
        assertEquals(-1, returnMinusOne);
    }

    @Test
    public void givenTwentyFiveAndTen_returnFifteen() {
        int returnFifteen = voteCount.voteCount(25, 10);
        assertEquals(15, returnFifteen);
    }

    @Test
    public void givenHundredAndOne_returnNinetyNine() {
        int returnNineteyNine = voteCount.voteCount(100, 1);
        assertEquals(99, returnNineteyNine);
    }
    @Test
    public void givenHundredAndHundred_returnZero() {
        int returnZero = voteCount.voteCount(100, 100);
        assertEquals(0, returnZero);
    }
}
