package Calculator;

import java.util.Scanner;

public class ScientificCalculator extends AbstractCalculator {
    @Override
    public double add(Double a, Double b){
        return a + b;
    }
    @Override
    public double add(Double a, Double b, Double c){
        return a + b + c;
    }
    @Override
    public double subtract(Double a, Double b){
        return a - b;
    }
    @Override
    public double subtract(Double a, Double b, Double c){
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
        if (b == 0){
            System.out.println("Cant divide by zero");
        }
        return a / b;
    }

    @Override
    public double divide(Double a, Double b, Double c) {
        if (b == 0 || c == 0){
            System.out.println("Cant divide by zero");
        }
        return a / b / c;
    }

    @Override
    public void displayAdditionalOperations() {
        System.out.println("1: Sine");
        System.out.println("2: Cosine");
        System.out.println("Choose operation: ");
    }


    @Override
    public void handleAdditionalOperations(int choice, Scanner scanner) {
        System.out.println("Enter the angle");
        double angle = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("The Sine of the angle " +angle+ " is " +sine(angle));
                break;
            case 2:
                System.out.println("The Cosine of the angle " +angle+ " is " +cosine(angle));
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public double sine(double angle){
        return Math.sin(Math.toRadians(angle));
    }

    public double cosine(double angle){
        return Math.cos(Math.toRadians(angle));
    }


}
