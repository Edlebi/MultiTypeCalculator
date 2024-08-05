package Lambda;

import java.util.Arrays;
import java.util.List;

public class StringFinder {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        Integer counter = Math.toIntExact(colors.stream().filter(num -> num.startsWith("B")).count());
        System.out.println(counter);

    }

}
