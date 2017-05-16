package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q4;

public class C1Q4Tests {
    
    @Test
    public void isPalindromePermutation_ShouldReturnTrue_WhenStringIsPalindromePermutation() {
        // Arrange
        String a = "Tact Coa";
        // Act
        boolean result = C1Q4.isPalindromePermutation(a);
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isPalindromePermutation_ShouldReturnFalse_WhenEmptyString () {
        // Arrange
        String a = "";
        // Act
        boolean result = C1Q4.isPalindromePermutation(a);
        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isPalindromePermutation_ShouldReturnFalse_WhenStringNotPermutationOfPalindrome () {
        // Arrange
        String a = "hello there, this is not a palindrome permutation.";
        // Act
        boolean result = C1Q4.isPalindromePermutation(a);
        // Assert
        Assert.assertFalse(result);
    }
}
