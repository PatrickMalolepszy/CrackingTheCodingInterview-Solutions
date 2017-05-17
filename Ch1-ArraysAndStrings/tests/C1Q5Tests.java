package tests;

import org.junit.Assert;
import org.junit.Test;
import questions.C1Q5;

public class C1Q5Tests {

    @Test
    public void oneAway_ShouldReturnTrue_WhenOneCharMissing () {
        // Arrange
        String a = "pale", b = "ple";
        // Act
        boolean result = C1Q5.oneAway(a, b);
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void oneAway_ShouldReturnTrue_WhenOneCharAdded () {
        // Arrange
        String a = "pales", b = "pale";
        // Act
        boolean result = C1Q5.oneAway(a, b);
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void oneAway_ShouldReturnTrue_WhenOneCharReplaced () {
        // Arrange
        String a = "pale", b = "bale";
        // Act
        boolean result = C1Q5.oneAway(a, b);
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void oneAway_ShouldReturnFalse_WhenMoreThanOneOff () {
        // Arrange
        String a = "hello there";
        String b = "another test";
        // Act
        boolean result = C1Q5.oneAway(a, b);
        // Assert
        Assert.assertFalse(result);
    }

}
