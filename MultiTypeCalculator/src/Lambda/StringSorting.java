package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        // Loop through list of strings
        // Sort string using built-in function

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

         colors.sort(String::compareTo);
         System.out.println("Ascending order: " + colors);

         colors.sort(Comparator.reverseOrder());
         System.out.println("Descending order: " + colors);

    }
}
