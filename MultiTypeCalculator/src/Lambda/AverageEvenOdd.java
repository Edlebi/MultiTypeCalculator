package Lambda;

import java.util.Arrays;
import java.util.List;

public class AverageEvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sum of even numbers
        double sumEven = nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        // Sum of odd numbers
        double sumOdd = nums.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumEven + " and odd numbers: " + sumOdd);
    }
}
