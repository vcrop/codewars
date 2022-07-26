package ru.vcrop.codewars.deadfish;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        List<Integer> list = new ArrayList<>();
        for (char ch: data.toCharArray())
            switch (ch) {
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> list.add(value);
            }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
