package ru.vcrop.codewars.middlepermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("bac", MiddlePermutation.findMidPerm("abc"));
        assertEquals("bdca", MiddlePermutation.findMidPerm("abcd"));
        assertEquals("cbxda", MiddlePermutation.findMidPerm("abcdx"));
        assertEquals("cxgdba", MiddlePermutation.findMidPerm("abcdxg"));
        assertEquals("dczxgba", MiddlePermutation.findMidPerm("abcdxgz"));
    }
}
