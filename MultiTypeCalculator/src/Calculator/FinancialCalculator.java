package Calculator;

import java.util.Scanner;

public class FinancialCalculator extends AbstractCalculator {

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
        if (b == 0){
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }

    @Override
    public double divide(Double a, Double b, Double c) {
        if (b == 0 || c == 0){
            System.out.println("Cannot divide by zero");
        }
        return a / b / c;
    }


    public double calculateInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public double calculateMortgage(double principal, double rate, int years) {
        double monthlyRate = rate / 12 / 100;
        int months = years * 12;
        return (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }

    @Override
    public void displayAdditionalOperations() {
        System.out.println("1: Calculate Interest");
        System.out.println("2: Calculate Mortgage");
        System.out.println("choose operation: ");
    }

    @Override
    public void handleAdditionalOperations(int choice, Scanner scanner) {
        switch (choice){
            case 1:
                System.out.println("Enter principal amount: ");
                double principal = scanner.nextDouble();
                System.out.println("Enter interest rate: ");
                double rate = scanner.nextDouble();
                System.out.println("Enter the time period in years: ");
                int years = scanner.nextInt();
                double interestRate = calculateInterest(principal, rate, years);
                System.out.println("The interest rate is " + interestRate);
                break;
            case 2:
                System.out.println("Enter the principal amount: ");
                double principal2 = scanner.nextDouble();
                System.out.println("Enter the annual interest rate: ");
                double rate2 = scanner.nextDouble();
                System.out.println("Enter the term in years: ");
                int time = scanner.nextInt();
                double mortgageResult = calculateMortgage(principal2, rate2, time);
                System.out.println("The monthly mortgage payment is: " + mortgageResult);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
