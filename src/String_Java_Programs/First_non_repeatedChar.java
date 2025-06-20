package String_Java_Programs;

import java.util.HashSet;

public class First_non_repeatedChar {

    public static void main(String[] args) {
        String input = "Rakeshaakkrr";
        char result = findFirstRepeatedChar(input);

        if (result != 0) {
            System.out.println("First repeated character: " + result);
        } else {
            System.out.println("No repeated characters found.");
        }
    }

    public static char findFirstRepeatedChar(String str) {
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return c; // First repeated character found
            } else {
                seen.add(c);
            }
        }

        return 0; // If no character is repeated
    }
}


