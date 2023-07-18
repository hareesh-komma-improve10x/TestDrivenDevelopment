package positivenegativezero;

public class PositiveNegativeZero {
    public String findPositiveNegativeOrZero(int n) {
        String result = "";
        if (n > 0) {
            result = "Positive";
        } else if (n < 0) {
            result = "Negative";
        }
        return result;
    }
}
