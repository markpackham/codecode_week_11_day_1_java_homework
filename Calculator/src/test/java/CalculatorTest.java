import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator(10, 5);
    }

    @Test
    public void hasAdd(){
        assertEquals(15,calc.add());
    }

    @Test
    public void hasSubtract(){
        assertEquals(5, calc.subtract());
    }

    @Test
    public void hasMultiply(){
        assertEquals(50, calc.multiply());
    }

    @Test
    public void hasDivide(){
        assertEquals(2.0, calc.divide(), 0.01);
    }
}


