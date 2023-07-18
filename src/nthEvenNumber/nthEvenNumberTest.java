package nthEvenNumber;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class nthEvenNumberTest {

    @Test
    public void nothing(){
    }

    @Test
    public void findNthEvenNumber(){
        nthEvenNumber nthEvenNumber = new nthEvenNumber();
        int num = nthEvenNumber.find(80);
        assertEquals(158,num);
    }

    @Test
    public void findNthEvenNumberMinusOne(){
        nthEvenNumber nthEvenNumber = new nthEvenNumber();
        int num = nthEvenNumber.find(-100);
        assertEquals(-1,num);
    }

    @Test
    public void findIsEvenNumber() {
        nthEvenNumber nthEvenNumber = new nthEvenNumber();
        int num = nthEvenNumber.find(90);
        assertEquals(178, num);
    }

    @Test
    public void findIsZeroEvenNumber() {
        nthEvenNumber nthEvenNumber = new nthEvenNumber();
        int num = nthEvenNumber.find(0);
        assertEquals(0, num);
    }
}
