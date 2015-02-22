import org.junit.*;
import com.bluesquare.calculator.Calculator;
import com.bluesquare.calculator.Result;
import static junit.framework.Assert.assertEquals;

public class CalculatorTests {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        Result result = calculator.add(1,2);
        assertEquals(3, result.getAnswer());
    }

    @Test
    public void testSubtraction(){
        Result result = calculator.subtract(5, 2);
        assertEquals(3, result.getAnswer());
    }

    @Test
    public void testMultiplication(){
        Result result = calculator.multiply(2, 5);
        assertEquals(10, result.getAnswer());
    }

    @Test
    public void testDivision(){
        Result result = calculator.divide(10,2);
        assertEquals(5, result.getAnswer());
    }

}
