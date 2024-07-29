package Calculator;

import java.util.Scanner;

public class Calculator extends AbstractCalculator {
    @Override
    public double add(Double a, Double b) {
        return a + b;
    }
    @Override
    public double add(Double a, Double b, Double c) {
        return a + b + c;
    }
    @Override
    public double subtract(Double a, Double b) {
        return a - b;
    }
    @Override
    public double subtract(Double a, Double b, Double c) {
        return a - b - c;
    }
    @Override
    public double multiply(Double a, Double b) {
        return a * b;
    }
    @Override
    public double multiply(Double a, Double b, Double c) {
        return a * b * c;
    }
    @Override
    public double divide(Double a, Double b) {
        if (b == 0) {
            System.out.println("Division by zero");
        }
        return a / b;
    }
    @Override
    public double divide(Double a, Double b, Double c) {
        if (b==0 || c==0) {
            System.out.println("Division by zero");
        }
        return a / b / c;
    }

    @Override
    public void displayAdditionalOperations() {
        System.out.println("Theres no additional operations");
    }

    @Override
    public void handleAdditionalOperations(int choice, Scanner scanner) {
        System.out.println("Theres no additional operations to handle");

    }


}
