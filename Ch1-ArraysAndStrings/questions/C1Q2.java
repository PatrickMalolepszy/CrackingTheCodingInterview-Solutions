package questions;

import java.util.HashMap;

/*
 *  Q1.2: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class C1Q2 {
    public static boolean isPerm(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> aCounts = new HashMap<>();
        HashMap<Character, Integer> bCounts = new HashMap<>();
        // Keep count of characters in both strings:
        for (int i = 0 ; i < a.length() ; i++ ) {
            int count = aCounts.getOrDefault(a.charAt(i), 0);
            aCounts.put(a.charAt(i), count + 1);

            count = bCounts.getOrDefault(b.charAt(i), 0);
            bCounts.put(b.charAt(i), count + 1);
        }
        // Make sure they contain the same characters first:
        if (aCounts.size() != bCounts.size()) return false;
        // Now check if the actually counts match up:
        for (Character c : aCounts.keySet()) {
            if (aCounts.get(c) != bCounts.get(c)) return false;
        }
        return true;
    }
}
