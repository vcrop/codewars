package ru.vcrop.codewars.bitcounting;

import java.util.stream.IntStream;

public class BitCounting {

    public static int countBits(int n){
        return (int) IntStream.iterate(n, i -> i != 0, i -> i ^ (i & -i)).count();
    }

}
