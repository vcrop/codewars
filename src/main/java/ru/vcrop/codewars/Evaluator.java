package ru.vcrop.codewars;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class Evaluator {

    public long evaluate(String s) {
        Map<String, IntBinaryOperator> operatorMap =
                Map.of("+", Integer::sum,
                        "-", (a, b) -> b - a,
                        "*", (a, b) -> a * b,
                        "/", (a, b) -> b / a);
        Deque<Integer> deque = new LinkedList<>();
        for (String token : s.split("\\s+"))
            if (operatorMap.containsKey(token)) deque.push(operatorMap.get(token).applyAsInt(deque.pop(), deque.pop()));
            else deque.push(Integer.parseInt(token));
        return deque.pop();
    }
}
