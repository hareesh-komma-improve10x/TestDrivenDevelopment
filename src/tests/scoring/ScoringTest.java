package scoring;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {

    private Scoring scoring = new Scoring();

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnsAllZeros() {
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenEmpty_returnsAllZeros() {
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnsOneZeroZero() {
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, onlyAScores);
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, onlyCScores);
    }

    @Test
    public void givenAB_returnsOneOneZero() {
        int[] abScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, abScores);
    }

    @Test
    public void givenABC_returnsAllOnes() {
        int[] abcScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, abcScores);
    }
}
