package com.nextly;

public class PaintBucket {
    public static void paintBucketFill(char[][] image, int x, int y, char newColor, char oldColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length) {
            return;
        }

        if(image[x][y] == oldColor)
            image[x][y] = newColor;

        paintBucketFill(image, x + 1, y, newColor, oldColor);
        paintBucketFill(image, x, y + 1, newColor, oldColor);
    }

    public static void main(String[] args) {
        char[][] image = {
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '#', '.'},
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '#', '.'},
                {'.', '#', '#', '#', '.', '.'},
        };

        System.out.println("Before:");
        displayImage(image);

        paintBucketFill(image, 0, 0, 'O', '#');

        System.out.println("After:");
        displayImage(image);
    }

    // Function to display the image
    public static void displayImage(char[][] image) {
        for (char[] row : image) {
            for (char pixel : row) {
                System.out.print(pixel);
            }
            System.out.println();
        }
    }
}
