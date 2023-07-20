package scoring;

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
}
