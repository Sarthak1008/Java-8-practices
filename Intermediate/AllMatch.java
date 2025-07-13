package Intermediate;

import java.util.Arrays;

public class AllMatch {
    public static void main(String[] args) {
        int[] a = new int[] { 6, 8, 7, 9, 10, 5, 4, 1, 2, 3 };

        boolean allLessThan20 = Arrays.stream(a)
                .allMatch(x -> x < 20); // check condition

        System.out.println("All elements less than 20? " + allLessThan20);
    }
}
