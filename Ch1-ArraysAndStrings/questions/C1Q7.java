package questions;

/**
 * Created by Patrick Malolepszy on 2017-05-29.
 *
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class C1Q7 {

    public static void rotateImage(int[][] image, int n) {
        if (image == null) {
            throw new IllegalArgumentException("Image was null!");
        }
        transposeMatrix(image, n);
        flipHorizontal(image, n);
    }

    // Transpose matrix in O(n^2)
    private static void transposeMatrix(int[][] image, int n) {
        for (int i = 0 ; i < n; i++) {
            for (int j = i ; j < n; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }
    }

    // Flip matrix horizontally in O(n^2)
    private static void flipHorizontal(int[][] image, int n) {
        for (int i = 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < n/2 ; j++ ) {
                int temp = image[i][j];
                image[i][j] =image[i][n-j-1];
                image[i][n-j-1] = temp;
            }
        }
    }
}
