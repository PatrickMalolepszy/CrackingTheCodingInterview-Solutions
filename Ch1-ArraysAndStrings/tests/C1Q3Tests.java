package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q3;

public class C1Q3Tests {

    @Test
    public void urlify_ShouldReplaceSpacesWith20_WhenGivenString () {
        // Arrange
        char a[] = new char[60];
        String testString = "hello there, this is a test";
        String expectedResult = "hello%20there,%20this%20is%20a%20test";
        for (int i = 0 ; i < testString.length() ; i++ ) {
            a[i] = testString.charAt(i);
        }
        boolean result = true;
        // Act
        C1Q3.urlify(a, testString.length());
        // Assert
        for (int i = 0 ; i < expectedResult.length() ; i++ ) {
            if (a[i] != expectedResult.charAt(i)) {
                result = false;
            }
        }
        Assert.assertTrue(result);
    }
}

