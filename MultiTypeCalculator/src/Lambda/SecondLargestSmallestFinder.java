package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestSmallestFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer secondLargest = numbers.stream().sorted().skip(1).findFirst().orElse(0);
        System.out.println(secondLargest);
        Integer secondSmallest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondSmallest);

    }
}
