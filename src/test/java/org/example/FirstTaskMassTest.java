package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskMassTest {
    private static Tasks tasks;

    @BeforeEach
    public void init(){
        tasks = new Tasks();
    }

    public static Stream<Arguments> dataNumbersAfter4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 4, 3, 3, 6}, new int[]{3, 3, 6}));
        list.add(Arguments.arguments(new int[]{1, 4}, new int[]{}));
        list.add(Arguments.arguments(new int[]{1, 3, 3, 6, 4, 7, 7}, new int[]{7, 7}));
        list.add(Arguments.arguments(new int[]{4, 3, 6}, new int[]{3, 6}));
        return list.stream();

    }

    @ParameterizedTest
    @MethodSource("dataNumbersAfter4")
    public void massTestNumbersAfter4(int[] in, int[] out){
        assertArrayEquals(out, tasks.numbersAfter4(in));
    }


}