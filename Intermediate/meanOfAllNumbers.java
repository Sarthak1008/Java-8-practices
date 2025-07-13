package Intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class meanOfAllNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(Arrays.stream(d).average().getAsDouble());

    }
}