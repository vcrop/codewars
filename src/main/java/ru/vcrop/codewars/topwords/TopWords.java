package ru.vcrop.codewars.topwords;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopWords {

    public static List<String> top3(String s) {
        String[] parts = s.split("(?i)[^a-z']");

        return Stream.of(parts)
                .filter(Predicate.not(String::isEmpty).and(Predicate.not(p -> p.matches("'+"))))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}
