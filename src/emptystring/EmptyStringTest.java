package emptystring;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyStringTest {

    private EmptyString emptyString = new EmptyString();


    /*
    isEmpty("") ➞ true
    isEmpty(" ") ➞ false
    isEmpty("b") ➞ false
    isEmpty("Hareesh") ➞ false
     */
    @Test
    public void givenEmptyString_returnsTrue() {
        boolean givenEmptyString = emptyString.isEmptyString("");
        assertEquals(true, givenEmptyString);
    }

    @Test
    public void givenSpaceString_returnsFalse() {
        boolean givenSpaceString = emptyString.isEmptyString(" ");
        assertEquals(false, givenSpaceString);
    }

    @Test
    public void givenNameString_returnsFalse() {
        boolean givenNameString = emptyString.isEmptyString("K.Hareesh");
        assertEquals(false, givenNameString);
    }
}
