import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
    calculator = new Calculator();
    }
    @Test
    public void canAdd() {
        assertEquals(9, calculator.add(5, 4));
    }
    @Test
    public void canSubtract() {
        assertEquals(1, calculator.subtract(5,4));
    }
    @Test
    public void canMultiply() {
        assertEquals(20, calculator.multiply(5,4));
    }

    @Test
    public void canDivide() {
        assertEquals(4.00, calculator.divide(8.88, 2.22), 0.01);
    }

}
