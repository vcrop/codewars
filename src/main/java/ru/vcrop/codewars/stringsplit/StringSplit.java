package ru.vcrop.codewars.stringsplit;

import java.util.stream.IntStream;

public class StringSplit {
    public static String[] solution(String s) {
        final String str = s + (s.length() % 2 == 1 ? "_" : "");
        return IntStream.range(0, str.length() / 2)
                .mapToObj(n -> str.substring(n * 2, n * 2 + 2))
                .toArray(String[]::new);
    }

}
