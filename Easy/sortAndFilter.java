package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class sortAndFilter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 1.) Filter odd numbers and sort them in ascending order.
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.stream(d)
                .filter(x -> x % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}