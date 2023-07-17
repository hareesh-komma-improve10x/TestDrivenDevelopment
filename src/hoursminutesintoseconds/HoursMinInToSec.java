package hoursminutesintoseconds;

public class HoursMinInToSec {

    public int convertHoursMinInToSec(int hours, int minutes) {
        int noOfSeconds = 0;
        noOfSeconds = hours * 3600 + minutes * 60;
        return noOfSeconds;
    }
}
