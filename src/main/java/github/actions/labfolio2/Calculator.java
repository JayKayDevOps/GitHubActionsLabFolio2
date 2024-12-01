package github.actions.labfolio2;

/**
 * This is a simple Calculator class to help demonstrate the working of unit tests
 * as part of a project integrating unit testing with Github Actions.
 * The project uses Java with Maven dependencies to integrate with Github Actions
 * When changes are made to the project and pushed to Github it triggers Github Actions
 * to run the units tests in the CalculatorTests class.
 */

public class Calculator {
    //method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    //method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    //method to divide two integers
    public int divide(int a, int b) {
        return a / b;
    }
}


