package com.nextly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintBucketTest {


    @Test
    void paintBucketFillWithB() {
        char[][] imageBefore = {
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '#', '.'},
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '#', '.'},
                {'.', '#', '#', '#', '.', '.'},
        };

        char[][] imageAfter = {
                {'.', 'O', 'O', 'O', '.', '.'},
                {'.', 'O', '.', '.', 'O', '.'},
                {'.', 'O', 'O', 'O', '.', '.'},
                {'.', 'O', 'O', 'O', '.', '.'},
                {'.', 'O', '.', '.', 'O', '.'},
                {'.', 'O', 'O', 'O', '.', '.'},
        };
        PaintBucket.paintBucketFill(imageBefore, 0,0,'O', '#');
        assertArrayEquals(imageBefore,imageAfter);
    }

    @Test
    void paintBucketFillWithP() {
        char[][] imageBefore = {
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '#', '.'},
                {'.', '#', '#', '#', '.', '.'},
                {'.', '#', '.', '.', '.', '.'}
        };

        char[][] imageAfter = {
                {'.', 'O', 'O', 'O', '.', '.'},
                {'.', 'O', '.', '.', 'O', '.'},
                {'.', 'O', 'O', 'O', '.', '.'},
                {'.', 'O', '.', '.', '.', '.'}
        };
        PaintBucket.paintBucketFill(imageBefore, 0,0,'O', '#');
        assertArrayEquals(imageBefore,imageAfter);
    }
}