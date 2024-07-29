package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractCalculator {
    public abstract double calculate(ArrayList<Double> numbers, ArrayList<Character> operators);

    public abstract void displayAdditionalOperations();

    public abstract void handleAdditionalOperations(int choice, Scanner scanner);
}
