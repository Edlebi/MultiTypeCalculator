package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class FinancialCalculator extends AbstractCalculator {
    @Override
    public double calculate(ArrayList<Double> numbers, ArrayList<Character> operators) {
        double result = numbers.getFirst();
        for(int i = 0; i < operators.size(); i++){
            char operator = operators.get(i);
            double nextNumber = numbers.get(i + 1);

            switch (operator) {
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                    if (nextNumber == 0) {
                        System.out.println("Cant divide by zero");
                    }
                    result /= nextNumber;
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    break;

            }
        }
        return result;
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
