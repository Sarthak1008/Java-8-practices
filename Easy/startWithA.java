package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class startWithA {
    public static void main(String[] args) {
        // 8.) Filter all strings that start with the letter 'a'.
        String[] a = new String[] { "Sarthak", "Aditya", "Shubham" };

        Arrays.stream(a).filter(x -> x.startsWith("a")).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
