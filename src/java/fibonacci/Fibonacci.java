package fibonacci;

public class Fibonacci {
    public int findNthNumber(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 0;
        }
        return n;
    }
}
