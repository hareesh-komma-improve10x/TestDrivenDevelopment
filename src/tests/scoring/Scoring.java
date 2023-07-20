package scoring;

public class Scoring {
    public int[] calculateScores(String score) {
        if (score != null && score.equals("A")) {
            return new int[] {1, 0, 0};
        }
        return new int[3];
    }
}
