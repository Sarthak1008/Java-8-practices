package Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringInAsc {

    public static void main(String[] args) {
        // 12.) Sort the strings in ascending order based on their length.
        String[] a = new String[]{"Ankit", "Rohit", "Suresh", "Meera", "Dev"};

      
    List<String> d = Arrays.stream(a)
                               .sorted(Comparator.comparingInt(String::length))
                               .collect(Collectors.toList());
}
