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
}
