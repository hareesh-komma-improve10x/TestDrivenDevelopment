package lessthanhundred;

public class LessThanHundred {
    public boolean findLessThanHundred(int a, int b) {
        boolean result = false;
        if (a + b <= 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
