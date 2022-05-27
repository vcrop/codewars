package ru.vcrop.codewars;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        if (pyramid.length != 1)
            for (int depth = pyramid.length - 2; depth > -1; depth--)
                for (int col = 0; col <= depth; col++)
                    pyramid[depth][col] += Math.max(pyramid[depth + 1][col], pyramid[depth + 1][col + 1]);
        return pyramid[0][0];
    }
}
