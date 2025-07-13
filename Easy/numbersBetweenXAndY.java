package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class numbersBetweenXAndY {
    public static void main(String[] args) {

        // 6.) Find all numbers between x and y
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number (X): ");
        int x = scan.nextInt();
        System.out.println("Enter the second number (Y): ");
        int y = scan.nextInt();
        int[] d = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] a = Arrays.stream(d).filter(z -> (z > x && z < y)).toArray();
        System.out.println(Arrays.toString(a));

    }
}
