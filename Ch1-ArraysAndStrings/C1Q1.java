/** Is Unique: Implement an algorithm to determine if a string
 * has all unique characters. What if you cannot use additional data structures?
 * Created by Patrick on 2017-05-02.
 */
public class C1Q1 {
    public static boolean isUnique(String s) {
        // Instead of using a hash map, we can assume ASCII range of characters
        boolean characterOccurrences [] = new boolean[256];
        for (int i = 0 ; i < s.length() ; i++ ) {
            if (characterOccurrences[s.charAt(i)]) {
                // Then we have found it before!
                return false;
            }
            characterOccurrences[s.charAt(i)] = true;
        }
        // If duplicate character never found, all characters must be unique.
        return true;
    }
}
