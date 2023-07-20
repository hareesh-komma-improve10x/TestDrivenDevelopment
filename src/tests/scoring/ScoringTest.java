package scoring;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnsAllZeros() {
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[0], allZeros);
    }
}
