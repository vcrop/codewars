package ru.vcrop.codewars;

public class Greed{
    public static int greedy(int[] dice){
        int[] count = new int[6];
        for (int i: dice)
            count[i - 1]++;
        return count[0] / 3 * 1000 + (count[0] - count[0] / 3 * 3) * 100 +
                count[1] / 3 * 200 +
                count[2] / 3 * 300 +
                count[3] / 3 * 400 +
                count[4] / 3 * 500 + (count[4] - count[4] / 3 * 3) * 50 +
                count[5] / 3 * 600;
    }
}