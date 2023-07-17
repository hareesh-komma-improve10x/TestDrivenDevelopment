package EvenNumber;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumberTest {

    @Test
    public void nothing(){
    }

    @Test
    public void findNthEvenNumber(){
        EvenNumber evenNumber = new EvenNumber();
        int num = evenNumber.find(80);
        assertEquals(158,num);
    }

    @Test
    public void findIsEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int num = evenNumber.find(90);
        assertEquals(178, num);
    }

    @Test
    public void findIsZeroEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int num = evenNumber.find(0);
        assertEquals(0, num);
    }
}
