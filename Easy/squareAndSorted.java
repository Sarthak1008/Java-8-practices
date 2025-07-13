package Easy;

import java.util.Arrays;

public class squareAndSorted {

    public static void main(String[] args) {
        // 7.) Square all numbers and sort them in ascending order.
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.stream(d).map(x -> x * x)
                .sorted()
                .forEach(System.out::println);

    }
}
