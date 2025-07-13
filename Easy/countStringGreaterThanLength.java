package Easy;

import java.util.Arrays;

public class countStringGreaterThanLength {

    public static void main(String[] args) {

        // 11.) Filter all strings that have a length greater than 5.
        String[] a = new String[] { "Sarthak", "Aditya", "Shubham" };

        Arrays.stream(a).filter(x -> x.length() > 5)
                .forEach(System.out::println);

    }
}
