package questions;

public class C1Q6 {
    public static String stringCompression(String a){
        if (a == null) {
            throw new IllegalArgumentException("stringCompression was passed null string!");
        }
        if (a.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char current = a.charAt(0);
        int currentCount = 1;
        for (int i = 1 ; i < a.length() ; i ++ ) {
            if (a.charAt(i) != current) {
                compressed.append(String.format("%c%d", current, currentCount));
                current = a.charAt(i);
                currentCount = 0;
            }
            currentCount++;
        }
        compressed.append(String.format("%c%d", current, currentCount));

        return compressed.length() < a.length() ? compressed.toString() : a ;
    }
}
