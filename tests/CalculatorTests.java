import org.junit.*;
import com.bluesquare.calculator.Calculator;
import static junit.framework.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(5,2));
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2,5));
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10,2));
    }

}
