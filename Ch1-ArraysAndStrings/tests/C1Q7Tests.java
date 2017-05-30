package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q7;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 *
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class C1Q7Tests {

    @Test
    public void rotateImage_testCase1 () {
        // Arrange
        int[][] image = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = new int[][] {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        // Act
        C1Q7.rotateImage(image, 3);
        // Assert
        Assert.assertArrayEquals(expected, image);
    }

    @SuppressWarnings("ConstantConditions")
    @Test(expected = IllegalArgumentException.class)
    public void rotateImage_ShouldThrowIllegalArgument_WhenImageIsNull () {
        // Act
        C1Q7.rotateImage(null, 2);
    }
}

