package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {
    private static Tasks tasks;

    @BeforeEach
    public void init(){
        tasks = new Tasks();
    }

    @Test
    public void test1NumbersAfter4() {
        int[] in = new int[]{2, 5, 7, 2, 4, 9, 9, 5, 1};
        int[] out = new int[]{9, 9, 5, 1};
        assertArrayEquals(out, tasks.numbersAfter4(in));

    }

    @Test
    public void test2NumbersAfter4() {
        int[] in = new int[]{4, 7, 7, 7, 1, 4, 5};
        int[] out = new int[]{5};
        assertArrayEquals(out, tasks.numbersAfter4(in));

    }

    @Test
    public void test3NumbersAfter4() {
        int[] in = new int[]{7, 9, 8, 1, 5};
        assertThrows(RuntimeException.class, () -> tasks.numbersAfter4(in));
    }


    @Test
    public void test1ContainsOneAndFour() {
        int[] in = new int[]{4, 9, 8, 1, 5};
        assertFalse(tasks.containsOneAndFour(in));
    }

    @Test
    public void test2ContainsOneAndFour() {
        int[] in = new int[]{4, 1, 1, 1, 4, 4, 1, 4};
        assertTrue(tasks.containsOneAndFour(in));
    }
}