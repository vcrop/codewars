package ru.vcrop.codewars.smallernumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Kata {
    public static long nextSmaller(long n) {
        List<String> digits = new ArrayList<>(List.of(Long.toString(n).split("")));

        for (int i = digits.size() - 2; i > -1; i--)
            if (digits.get(i).compareTo(digits.get(i + 1)) > 0) {
                int max_pos = i + 1;
                for (int j = digits.size() - 1; j > i; j--)
                    if (digits.get(j).compareTo(digits.get(i)) < 0 && digits.get(j).compareTo(digits.get(max_pos)) > 0)
                        max_pos = j;
                Collections.swap(digits, i, max_pos);
                digits.subList(i + 1, digits.size()).sort(Comparator.reverseOrder());
                break;
            }

        long result = Long.parseLong(String.join("", digits));

        return digits.get(0).equals("0") || result == n ? -1 : result;
    }
}
