package questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 * Zero matrix: Write an algorithm such that if an element in an
 * MxN matrix is 0, its entire row and column are set to 0.
 */
public class C1Q8 {
    public static void zeroMatrix(int[][] matrix, int m, int n) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }

        // Add rows and columns to set
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        // Touch every element in the array in O(nm) time.
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Now set selected rows and columns to 0:
        for (Integer a : zeroRows) {
            for (int i = 0 ; i < n ; i++ ) {
                matrix[a][i] = 0;
            }
        }
        for (Integer a : zeroCols) {
            for (int i = 0 ; i < m ; i++ ) {
                matrix[i][a] = 0;
            }
        }
    }
}
