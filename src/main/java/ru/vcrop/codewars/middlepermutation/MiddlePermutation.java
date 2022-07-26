package ru.vcrop.codewars.middlepermutation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class MiddlePermutation {

    public static String findMidPerm(String strng) {

        int count = strng.length();

        BigInteger factorial = IntStream.rangeClosed(1, count)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger must = factorial.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
        factorial = factorial.divide(BigInteger.valueOf(count--));

        List<String> letters = new ArrayList<>(List.of(strng.split("")));
        Collections.sort(letters);

        List<String> result = new ArrayList<>();

        while (count > 1) {
            BigInteger[] divideAndRemaining = must.divideAndRemainder(factorial);
            result.add(letters.remove(divideAndRemaining[0].intValue()));
            must = divideAndRemaining[1];
            factorial = factorial.divide(BigInteger.valueOf(count--));
        }

        if (must.equals(BigInteger.ZERO)) result.addAll(letters);
            else {
                result.add(letters.get(1));
                result.add(letters.get(0));
        }

        return String.join("", result);
    }
}
