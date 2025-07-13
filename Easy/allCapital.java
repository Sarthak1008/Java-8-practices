package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class allCapital {
    public static void main(String[] args) {

        // 10.) Convert all strings to uppercase.
        String[] a = new String[] { "Sarthak", "Aditya", "Shubham" };

        Arrays.stream(a).map(x -> x.toUpperCase()).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
