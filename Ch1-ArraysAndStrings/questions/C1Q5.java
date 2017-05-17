package questions;

public class C1Q5 {

    public static boolean oneAway(String a, String b) {

        int difference = Math.abs(a.length() - b.length());
        if (difference > 1) return false;

        // Force a to be the smaller string:
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
        }

        int changes = 0;
        boolean oneOff = difference == 1;
        int i, j;
        for (i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (a.charAt(i) != b.charAt(j)) {
                // either was shift, or it was a replace:
                if (oneOff) { // for shift case
                    i--;
                    oneOff = false;
                }
                changes++;
                if (changes > 1) {
                    return false;
                }
            }
        }
        // last character? or single change along the way
        return oneOff || changes == 1;

    }
}
