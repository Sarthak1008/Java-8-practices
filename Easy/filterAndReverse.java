package Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class filterAndReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 2.) Filter numbers greater than 5 and print them in reverse order.
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.stream(d)
                .filter(x -> x > 5).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
                .boxed().collect(Collectors.toList())
                .forEach(System.out::println);
    }
}