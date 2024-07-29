package UI;

import Calculator.AbstractCalculator;
import Calculator.Calculator;
import Calculator.*;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Double> numbers;
    private ArrayList<Character> operators;
    private AbstractCalculator calculator;
    private Scanner scanner;
    private boolean isStandardCalculator;

    public UserInterface(){
        scanner = new Scanner(System.in);
        numbers = new ArrayList<>();
        operators = new ArrayList<>();
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
            System.out.println("1: Normal Calculator");

            if (isStandardCalculator == false) {
                System.out.println("2: additional operations");
            }

            System.out.println("Choose one of the options by entering a number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleNormalOperations();
                    break;
                case 2:
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

    private void handleNormalOperations(){
        System.out.println("enter the first number: ");
        double firstNumber = scanner.nextDouble();
        numbers.add(firstNumber);

        while (true){
            System.out.println("enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            if (operator == '='){
                break;
            }
            operators.add(operator);

            System.out.println("Enter the second number: ");
            numbers.add(scanner.nextDouble());
        }

        double result = calculator.calculate(numbers, operators);
        System.out.println("The result is: " + result);



    }

    private void handleAdditionalOperations(){
        calculator.displayAdditionalOperations();
        int choice = scanner.nextInt();
        calculator.handleAdditionalOperations(choice, scanner);
    }



    }




