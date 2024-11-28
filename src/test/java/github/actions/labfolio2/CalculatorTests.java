package github.actions.labfolio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {


    @Test
    void testCalculatorAdds(){
        var calculator = new Calculator();
        int actual = calculator.add(2,3);

        assertEquals(5,actual);
    }

    @Test
    void testCalculatorMultiplies(){
        var calculator = new Calculator();
        int actual = calculator.multiply(2, 3);

        assertEquals(6, actual);

    }
}
