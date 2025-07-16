package groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupStringsByTheirLength {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "kiwi", "pear", "grape", "orange", "ban" };
        Map<Integer, List<String>> map = Arrays.stream(words)
                .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(map.get(5));
        System.out.println(map.get(4));
        System.out.println(map.get(6));
    }
}
