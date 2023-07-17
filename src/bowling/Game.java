package bowling;

public class Game {

    private int totalPins = 0;
    public void roll(int pins) {
        totalPins += pins;
    }

    public int score() {
        return totalPins;
    }
}
