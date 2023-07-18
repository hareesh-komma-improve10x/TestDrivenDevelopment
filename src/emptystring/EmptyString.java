package emptystring;

public class EmptyString {
    public boolean isEmptyString(String text) {

        boolean result = false;
        if (text.equals("")) {
            result = true;
        }
        return result;
    }
}
