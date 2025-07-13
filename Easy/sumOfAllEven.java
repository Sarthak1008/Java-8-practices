package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfAllEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 3.) Find the sum of all even numbers in the array.
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(Arrays.stream(d)
                .filter(x -> x % 2 == 0)
                .sum());
    }
}