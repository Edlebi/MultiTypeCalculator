package Lambda;

import java.util.*;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 10);
        System.out.println(randomNumber.get());

        Function<String, String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("Hello"));

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(6));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur first name: ");
        String firstName = sc.nextLine();

        execute(s -> System.out.println("Hello " + s), firstName);

        supplierExecute(() -> "Hello " + firstName);

        Supplier<List<Integer>> numbers = () -> List.of(1, 2, 3, 4, 5);
        System.out.println(numbers.get());

        Predicate<String> ifEmpty = s -> s.isEmpty();
        System.out.println(ifEmpty.test("Hello"));

        Function<Integer, Integer> square = (num) -> num * num;
        System.out.println(square.apply(4));

        System.out.println("Send message: ");
        String message = sc.nextLine();

        Consumer<String> process = (s) -> System.out.println("Processed: " +s);
        process.accept(message);

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Function<String, Integer> vowelCounter = s -> {
            int counter = 0;
            for (char letter : s.toLowerCase().toCharArray()){
                if (vowels.contains(letter)){
                    counter++;
                }
            }
            return counter;
        };
        System.out.println(vowelCounter.apply("Hamzeh"));

        Predicate<Integer> checkPerfectSquare = num -> {
            double sqrt = Math.sqrt(num);
            return sqrt == Math.floor(sqrt);

        };

        System.out.println(checkPerfectSquare.test(25));

        List<String> Cars = Arrays.asList("BMW", "Mercedes", "Jaguar", "Bentley", "Dodge");

        Comparator<List<String>> lengthComparator = (s1, s2) -> Integer.compare(s1.size(), s2.size());
        System.out.println(lengthComparator.compare(Collections.singletonList(Cars.get(0)), Collections.singletonList(Cars.get(1))));

        BiFunction<String, String, String> concatenation = (s1, s2) -> s1.concat(" " +s2);
        System.out.println(concatenation.apply("Hamzeh", "Edlebi"));

        Function<String, Integer> lenghtString = n -> n.length();
        System.out.println(lenghtString.apply("Hamzeh"));


        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<String, String> combinedFunction = reverse.andThen(upperCase);
        System.out.println(combinedFunction.apply("Hamzeh"));


    }
    public static void execute(Consumer<String> print, String name){
        print.accept(name);
    }

    public static void supplierExecute(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
