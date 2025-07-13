package Intermediate;

import java.util.Arrays;

public class StringReversal {
    public static void main(String[] args) {
        String[] a = new String[] { "Sarthak", "Aditya", "Shubham" };

        String[] reversed = Arrays.stream(a)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toArray(String[]::new);

        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}
