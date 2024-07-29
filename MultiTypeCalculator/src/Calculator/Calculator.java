package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator extends AbstractCalculator {
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
        System.out.println("Theres no additional operations");
    }

    @Override
    public void handleAdditionalOperations(int choice, Scanner scanner) {
        System.out.println("Theres no additional operations to handle");

    }


}
