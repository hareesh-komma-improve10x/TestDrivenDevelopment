package evenorodd;

public class EvenOrOdd {
    public String findEvenOdd(int n) {
        String result = "";
        if (n % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;

    }
}
