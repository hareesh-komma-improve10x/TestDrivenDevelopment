package nameinverter;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnsEmpty() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }
}
