package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stringContainingE {
    public static void main(String[] args) {
        // 9.) Filter all strings that contain the letter 'e'.
        String[] a = new String[] { "Sarthake", "Aditya", "Shubham" };

        Arrays.stream(a).filter(x -> x.contains("e")).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
