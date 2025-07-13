package Intermediate;

import java.util.Arrays;

class moreThanOneVowel {
    public static void main(String[] args) {
        String[] a = new String[] { "Ankit", "Rohit", "Suresh", "Meera", "Dev" };

        long d = Arrays.stream(a) // Imp
                .filter(x -> x.toLowerCase().matches(".*[aeiou].*")).count();

        System.out.println(d); // Outputs count of strings containing at least one vowel
    }
}