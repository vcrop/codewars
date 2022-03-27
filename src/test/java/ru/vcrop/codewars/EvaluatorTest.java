package ru.vcrop.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluatorTest {

    @Test
    public void test1() throws Exception {
        Evaluator eval = new Evaluator();
        assertEquals(10, eval.evaluate("2 3 9 4 / + *"));
    }
}