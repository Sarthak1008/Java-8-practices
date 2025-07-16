package partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StartsWithVowel {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "kiwi", "pear", "grape", "orange", "ban" };
        Map<Boolean, List<String>> map = Arrays.stream(words)
                .collect(Collectors.partitioningBy(x -> x.matches("(?i)^[aeiou].*")));
        System.out.println(map.get(false));
        System.out.println(map.get(true));
    }
}
