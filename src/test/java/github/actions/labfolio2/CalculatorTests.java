package github.actions.labfolio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {


    @Test
    void testCalulatorAdds(){
        var calculator = new Calculator();
        int actual = calculator.add(2,3);

        assertEquals(4,actual);

    }
}
