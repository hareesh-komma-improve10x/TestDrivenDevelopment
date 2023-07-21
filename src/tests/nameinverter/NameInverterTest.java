package nameinverter;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    private NameInverter nameInverter = new NameInverter();

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnsEmpty() {
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenSingleWord_returnsSingleWord() {
        String invertedName = nameInverter.invertName("name");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithTrailingSpace_returnsSingleWord() {
        String invertedName = nameInverter.invertName("name  ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithBeginningSpace_returnsSingleWord() {
        String invertedName = nameInverter.invertName(" name  ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenFirstLast_returnsInvertedName() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd() {
        String invertedName = nameInverter.invertName("first last MSc. PhD.");
        assertEquals("last, first MSc. PhD.", invertedName);
    }
}
