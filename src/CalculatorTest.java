import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        // Positive test cases
        assertEquals(4.0, Calculator.addition(2.0, 2.0), 0.001);
        assertEquals(-5.0, Calculator.addition(-3.0, -2.0), 0.001);

        // Edge case
        assertEquals(0.0, Calculator.addition(0.0, 0.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();

        // Positive test cases
        assertEquals(3.0, Calculator.subtraction(5.0, 2.0), 0.001);
        assertEquals(-1.0, Calculator.subtraction(2.0, 3.0), 0.001);

        // Edge case
        assertEquals(0.0, Calculator.subtraction(0.0, 0.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();

        // Positive test cases
        assertEquals(6.0, calculator.multiplication(2.0, 3.0), 0.001);
        assertEquals(-6.0, calculator.multiplication(-2.0, 3.0), 0.001);

        // Edge case
        assertEquals(0.0, calculator.multiplication(0.0, 0.0), 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();

        // Positive test cases
        assertEquals(2.0, calculator.division(6.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.division(6.0, -3.0), 0.001);

    }




}
