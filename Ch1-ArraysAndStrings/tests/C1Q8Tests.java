package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q8;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 * Zero matrix: Write an algorithm such that if an element in an
 * MxN matrix is 0, its entire row and column are set to 0.
 */
public class C1Q8Tests {
    @Test
    public void zeroMatrix_TestCase1 () {
        // Arrange
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        int[][] expected = new int[][] {
                {1, 0, 3},
                {0, 0, 0},
                {7, 0, 9}
        };
        // Act
        C1Q8.zeroMatrix(matrix, 3, 3);
        // Assert
        Assert.assertArrayEquals(expected, matrix);
    }

    @Test
    public void zeroMatrix_TestCase2 () {
        // Arrange
        int[][] matrix = new int[][] {
                {1, 2, 3, 8, 8, 1},
                {4, 0, 6, 3, 3, 8},
                {7, 8, 9, 0, 6, 2}
        };
        int[][] expected = new int[][] {
                {1, 0, 3, 0, 8, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        // Act
        C1Q8.zeroMatrix(matrix, 3, 6);
        // Assert
        Assert.assertArrayEquals(expected, matrix);
    }

    @SuppressWarnings("ConstantConditions")
    @Test(expected = IllegalArgumentException.class)
    public void zeroMatrix_ShouldThrowIllegalArgument_WhenImageIsNull () {
        // Act
        C1Q8.zeroMatrix(null, 2, 7);
    }
}
