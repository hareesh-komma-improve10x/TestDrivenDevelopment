package integerinrange;

public class IntegerInRange {
    public boolean findIntWithinBounds(int n, int lowerBound, int upperBound) {
        boolean result = false;
        if (n >= lowerBound && n < upperBound) {
            result = true;
        }
        return result;
    }
}
