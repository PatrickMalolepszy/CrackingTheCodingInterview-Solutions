package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q6;

public class C1Q6Tests {
    @Test
    public void stringCompression_TestCase1 () {
        // Arrange
        String a = "aabcccccaaa";
        // Act
        String result = C1Q6.stringCompression(a);
        // Assert
        Assert.assertEquals("a2b1c5a3", result);
    }

    @Test
    public void stringCompression_TestCase2 () {
        // Arrange
        String a = "aTTTtttEdeWgHHHHHHHweDDDddssssssssssst";
        // Act
        String result = C1Q6.stringCompression(a);
        // Assert
        Assert.assertEquals("a1T3t3E1d1e1W1g1H7w1e1D3d2s11t1", result);
    }

    @Test
    public void stringCompression_ShouldReturnOriginalString_WhenCompressionLarger () {
        // Arrange
        String a = "abddfgedg";
        // Act
        String result = C1Q6.stringCompression(a);
        // Assert
        Assert.assertEquals(a, result);
    }
}

