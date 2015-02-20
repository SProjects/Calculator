import org.junit.*;
import com.bluesquare.calculator.Calculator;
import static junit.framework.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,2));
    }

}
