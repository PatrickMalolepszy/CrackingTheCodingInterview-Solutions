package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q9;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 * String Rotation: Assume you have a method isSubstring which checks if
 * one word is a substring of another. Given two strings, s1 and s2,
 * write code to check if s2 is a rotation of s1 using only one call to isSubstring.
 */
public class C1Q9Tests {
    @Test
    public void isStringRotation_ShouldReturnTrue_WhenStringRotated () {
        // Arrange
        String a = "rabbit";
        String b = "bitrab";
        // Act
        boolean result = C1Q9.isStringRotation(a, b);
        // Assert
        Assert.assertTrue(result);
    }
    @Test
    public void isStringRotation_ShouldReturnFalse_WhenStringsDifferentLength () {
        // Arrange
        String a = "rabbit", b = "dog";
        // Act
        boolean result = C1Q9.isStringRotation(a, b);
        // Assert
        Assert.assertFalse(result);
    }
    @Test
    public void isStringRotation_Should_WhenNotRotation () {
        // Arrange
        String a = "rabbit", b = "rabbat";
        // Act
        boolean result = C1Q9.isStringRotation(a, b);
        // Assert
        Assert.assertFalse(result);
    }

    @SuppressWarnings("ConstantConditions")
    @Test(expected = IllegalArgumentException.class)
    public void zeroMatrix_ShouldThrowIllegalArgument_WhenImageIsNull () {
        // Act
        C1Q9.isStringRotation(null, null);
    }
}
