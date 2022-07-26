package ru.vcrop.codewars.spiralizor;

public class Spiralizor {

    private static void implementation(int[][] array, int offset, int size) {
        if (size < 1) return;
        if (offset != 0) array[offset][offset - 1] = 1;
        for (int row = offset; row < offset + size; row++)
            if (row == offset || (row == offset + size - 1 && row != offset + 1))
                for (int col = offset; col < offset + size; col++)
                    array[row][col] = 1;
            else {
                array[row][offset + size - 1] = 1;
                if (row != offset + 1) array[row][offset] = 1;
            }
        implementation(array, offset + 2, size - 4);
    }

    public static int[][] spiralize(int size) {
        int[][] spiral = new int[size][size];
        implementation(spiral, 0, size);
        return spiral;
    }

}
