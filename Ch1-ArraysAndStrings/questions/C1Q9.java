package questions;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 * String Rotation: Assume you have a method isSubstring which checks if
 * one word is a substring of another. Given two strings, s1 and s2,
 * write code to check if s2 is a rotation of s1 using only one call to isSubstring.
 */
public class C1Q9 {
    public static boolean isStringRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Passed null string to isStringRotation");
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        String doubleS2 = s2 + s2;
        if (doubleS2.contains(s1)) {
            return true;
        }
        return false;
    }
}
