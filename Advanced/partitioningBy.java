package Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitioningBy {
    public static void main(String[] args) {
        int[] numbers = { 3, 6, 1, 2, 9, 4, 6, 2 };

        // Convert int[] to List<Integer>
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Map<Boolean, List<Integer>> partitioned = numberList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}
