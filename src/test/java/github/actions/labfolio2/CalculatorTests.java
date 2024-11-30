package github.actions.labfolio2;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
//import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    @Test
    void testCalculatorAdds() {
        var calculator = new Calculator();
        int actual = calculator.add(2, 3);

        assertEquals(5, actual);
    }
}

@Suite
@SuiteDisplayName("A Calculator Test Suite")
class TwoCalculatorTests {
    void testCalculatorMultiplies() {
        var calculator = new Calculator();
        int actual = calculator.multiply(2, 3);

        assertEquals(6, actual);

    }

    void testCalculatorDivides() {
        var calculator = new Calculator();
        int actual = calculator.divide(6, 3);

        assertEquals(6, actual);

    }
}
