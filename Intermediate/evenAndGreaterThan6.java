package Intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndGreaterThan6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] a = Arrays.stream(d)
                .filter(x -> x % 2 == 0 && x > 6)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(a));
    }
}