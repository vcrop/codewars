package ru.vcrop.codewars.findodd;

import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] a) {
        return IntStream.of(a).reduce((c, b) -> c ^ b).orElseThrow();
    }
}
