package Chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @Before
    public void setup(){
        stringCalculator = new StringCalculator();
        System.out.println("before");
    }
    
    @Test
    public void add(){
        assertEquals(10, stringCalculator.repeatOpr("+","1,5:4"));
        System.out.println("add");
    }
}
