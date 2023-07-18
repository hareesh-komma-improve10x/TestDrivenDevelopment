package nthEvenNumber;

public class nthEvenNumber {
        public int find(int n) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                return -1;
            }
            int num = 2*(n-1);
            return num;
        }
    }
