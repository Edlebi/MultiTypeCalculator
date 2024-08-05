package Lambda;

import java.util.Arrays;
import java.util.List;

public class StringConverter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hamzeh", "Ahmad", "Omar", "Karim");

        List<String> namesUpper = names.stream().map(String::toUpperCase).toList();
        System.out.println(namesUpper);
        List<String> namesLower = names.stream().map(String::toLowerCase).toList();
        System.out.println(namesLower);
    }
}
