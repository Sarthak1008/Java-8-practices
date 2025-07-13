package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class divisibleBy3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 5.) Count how many numbers are divisible by 3.
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(Arrays.stream(d)
                .filter(x -> x % 3 == 0)
                .count());

    }
}