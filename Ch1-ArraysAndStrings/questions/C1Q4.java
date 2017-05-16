package questions;

import java.util.HashMap;

/**
 * 1.4: Given a string, write a function to check if it is a permutation of a palindrome.
 */
public class C1Q4 {

    public static boolean isPalindromePermutation(String a) {
        // We need all characters to occur twice if string is of even length,
        // otherwise, one character must appear once.

        // not defined in problem, lets assume an empty string is not a palindrome.
        if (a.isEmpty()) {
            return false;
        }

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        int currentCount;
        // spaces are not considered in the example test case, must track this.
        int lengthWithoutSpaces = a.length();

        for (int i = 0 ; i < a.length() ; i++ ) {
            // Assume only alpha characters
            if (!Character.isAlphabetic(a.charAt(i))) {
                lengthWithoutSpaces--;
                continue;
            }
            currentCount = characterCounts.getOrDefault(Character.toLowerCase(a.charAt(i)), 0);
            characterCounts.put(Character.toLowerCase(a.charAt(i)), currentCount + 1);
        }

        // Check to see how many characters appear an odd number of times
        int oddCount = 0;
        for (Character c : characterCounts.keySet()) {
            if ( (characterCounts.get(c) % 2) != 0) {
                oddCount++;
                if (oddCount > 1) return false;
            }
        }

        // Determine result based on if the string (without non-alphas) is even or odd length:
        if (lengthWithoutSpaces % 2 == 0) { // Even
            if (oddCount == 0) return true;
        } else { // odd
            if (oddCount == 1) return true;
        }

        return false;
    }

}
