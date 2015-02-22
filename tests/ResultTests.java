import com.bluesquare.calculator.Result;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ResultTests {

    private Result result = new Result(2,"SUCCESS");

    @Test
    public void testGetAnswer(){
        assertEquals(2, result.getAnswer());
    }

    @Test
    public void testGetErrorMessage(){
        assertEquals("SUCCESS", result.getErrorMessage());
    }

}
