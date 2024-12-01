package github.actions.labfolio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the CalculatorTests class that tests
 * the methods from the Calculator Class.
 */

class CalculatorTest {

    //Testing the Calculator Add method
    @Test
    void testCalculatorAdds() {
        var calculator = new Calculator();
        int actual = calculator.add(2, 3);

        assertEquals(5, actual);
    }

    //Testing the Calculator Multiplies method
    @Test
    void testCalculatorMultiplies() {
        var calculator = new Calculator();
        int actual = calculator.multiply(2, 3);

        assertEquals(6, actual);
    }

    //Testing the Calculator Divides method
    @Test
    void testCalculatorDivides() {
        var calculator = new Calculator();
        int actual = calculator.divide(6, 3);

        assertEquals(2, actual);
    }
}

