package UI;

import Calculator.AbstractCalculator;
import Calculator.Calculator;
import Calculator.*;


import java.util.Scanner;

public class UserInterface {
    private AbstractCalculator calculator;
    private Scanner scanner;
    private boolean isStandardCalculator;

    public UserInterface(){
        scanner = new Scanner(System.in);
        chooseCalculatorType();
    }


    public void chooseCalculatorType(){
        System.out.println("Choose a calculator type (1: Standard, 2: Scientific, 3: Financial): ");
        int type = scanner.nextInt();
        switch(type){
            case 1:
                calculator = new Calculator();
                isStandardCalculator = true;
                break;
            case 2:
                calculator = new ScientificCalculator();
                isStandardCalculator = false;
                break;
            case 3:
                calculator = new FinancialCalculator();
                isStandardCalculator = false;
                break;
            default:
                System.out.println("Wrong choice. standard calculator selected");
                calculator = new Calculator();
                isStandardCalculator = true;

        }
    }


    public void choose(){
        while(true) {
            System.out.println("1: two numbers");
            System.out.println("2: three numbers");

            if (isStandardCalculator == false) {
                System.out.println("3: additional operations");
            }

            System.out.println("Choose one of the options by entering a number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleTwoInputs();
                    break;
                case 2:
                    handleThreeInputs();
                    break;
                case 3:
                    handleAdditionalOperations();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to continue? (y/n)");
            char answer = scanner.next().charAt(0);
            if (answer != 'y') {
                System.out.println("Closing program");
                System.out.println("Thank you for using Calculator");
                break;
            } else {
                System.out.println("Do you want to choose a new calculator? (y/n)");
                answer = scanner.next().charAt(0);
                if (answer == 'y') {
                    chooseCalculatorType();
                }
            }
        }

    }

    private void handleTwoInputs(){
        System.out.println("enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter an operation (+, -, *, /)");
        char operation = scanner.next().charAt(0);

        double result = calculate(firstNumber, secondNumber, operation);
        System.out.println("The result is: " + result);



    }
    private void handleThreeInputs(){
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = calculate(firstNumber, secondNumber,thirdNumber, operator);
        System.out.println("Result: " +result);
    }

    private void handleAdditionalOperations(){
        calculator.displayAdditionalOperations();
        int choice = scanner.nextInt();
        calculator.handleAdditionalOperations(choice, scanner);
    }


    private double calculate(double firstNumber, double secondNumber, char operator){
        return switch (operator) {
            case ('+') -> calculator.add(firstNumber, secondNumber);
            case ('-') -> calculator.subtract(firstNumber, secondNumber);
            case ('*') -> calculator.multiply(firstNumber, secondNumber);
            case ('/') -> calculator.divide(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid operator");
                yield 0;
            }
        };
    }
    private double calculate(double firstNumber, double secondNumber, double thirdNumber, char operator){
        return switch (operator) {
            case ('+') -> calculator.add(firstNumber, secondNumber, thirdNumber);
            case ('-') -> calculator.subtract(firstNumber, secondNumber, thirdNumber);
            case ('*') -> calculator.multiply(firstNumber, secondNumber, thirdNumber);
            case ('/') -> calculator.divide(firstNumber, secondNumber, thirdNumber);
            default -> {
                System.out.println("Invalid operator");
                yield 0;
            }
        };
    }






}


