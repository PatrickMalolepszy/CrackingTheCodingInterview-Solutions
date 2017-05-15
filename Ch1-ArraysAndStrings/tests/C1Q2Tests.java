package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q2;

public class C1Q2Tests {

    @Test
    public void isPerm_ShouldReturnFalse_WhenStringsAreDifferentLengths () {
        // Arrange
        String a = "hello there how are you?";
        String b = "there how";
        // Act
        boolean result = C1Q2.isPerm(a, b);
        // Assert
        Assert.assertFalse(result);
    }
    @Test
    public void isPerm_ShouldReturnTrue_WhenStringsArePermutations () {
        // Arrange
        String a = "care free";
        String b = "free care";
        // Act
        boolean result = C1Q2.isPerm(a, b);
        // Assert
        Assert.assertTrue(result);
    }
}
