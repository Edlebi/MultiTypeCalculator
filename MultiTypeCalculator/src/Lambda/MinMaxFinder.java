package Lambda;

import java.util.Arrays;
import java.util.List;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer min = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("min = " +min);
        Integer max = numbers.stream().min(Integer :: compare).orElse(0);
        System.out.println("max = " +max);
    }
}
