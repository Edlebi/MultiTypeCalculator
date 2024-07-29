package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ScientificCalculator extends AbstractCalculator {
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
