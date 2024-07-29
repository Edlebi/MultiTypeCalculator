package Calculator;

import java.util.Scanner;

public abstract class AbstractCalculator {
    public abstract double add(Double a, Double b);

    public abstract double add(Double a, Double b, Double c);

    public abstract double subtract(Double a, Double b);

    public abstract double subtract(Double a, Double b, Double c);

    public abstract double multiply(Double a, Double b);

    public abstract double multiply(Double a, Double b, Double c);

    public abstract double divide(Double a, Double b);

    public abstract double divide(Double a, Double b, Double c);

    public abstract void displayAdditionalOperations();

    public abstract void handleAdditionalOperations(int choice, Scanner scanner);
}
