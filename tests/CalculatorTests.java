import org.junit.*;
import com.bluesquare.calculator.Calculator;
import static junit.framework.Assert.assertEquals;

public class CalculatorTests {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void testSubtraction(){
        assertEquals(3, calculator.subtract(5,2));
    }

    @Test
    public void testMultiplication(){
        assertEquals(10, calculator.multiply(2,5));
    }

    @Test
    public void testDivision(){
        assertEquals(5, calculator.divide(10,2));
    }

}
