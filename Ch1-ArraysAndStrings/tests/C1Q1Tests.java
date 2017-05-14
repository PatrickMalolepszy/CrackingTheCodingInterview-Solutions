package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q1;


public class C1Q1Tests {

    @Test
    public void isUnique_ShouldReturnFalse_WhenStringContainsDuplicates() {
        // Arrange
        String a = "Hello this should be false";
        // Act
        boolean result = C1Q1.isUnique(a);
        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isUnique_ShouldReturnTrue_WhenStringIsUnique () {
        // Arrange
        String a = "Mr JockTVquizPhDbagsfewlynx.";
        // Act
        boolean result = C1Q1.isUnique(a);
        // Assert
        Assert.assertTrue(result);
    }
}
