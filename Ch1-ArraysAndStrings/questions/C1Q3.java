package questions;
/*
    URLify: replace spaces with "%20" in a given String
    Do not use Java's String class, assume given length of true string
    Must be in place ( O(1) space complexity )
 */
public class C1Q3 {
    public static void urlify(char [] url, int length) {
        for (int i = 0 ; i < length ; i++ ) {
            if (url[i] == ' ') {
                for (int j = length ; j > i ; j--) {
                    url[j+2] = url[j];
                }
                length += 2;
                url[i] = '%';
                url[i+1] = '2';
                url[i+2] = '0';
            }
        }
    }
}
