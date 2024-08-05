package Lambda;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);

        List<Integer> noDuplicates = nums.stream()
                .distinct()
                .toList();

        System.out.println(noDuplicates.size());
    }
}
