package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private Game game = new Game();

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void canRoll() {
        game.roll(1);
    }

    @Test
    public void gutterGame() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}
