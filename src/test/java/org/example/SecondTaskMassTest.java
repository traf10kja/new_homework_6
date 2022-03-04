package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskMassTest {

    private static Tasks tasks;

    @BeforeEach
    public void init() {
        tasks = new Tasks();
    }

    public static Stream<Arguments> dataContainsOneAndFour() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{9, 1, 23, 4, 6}, false));
        list.add(Arguments.arguments(new int[]{4, 1, 4, 4}, true));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4, 4}, false));
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1, 1}, false));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataContainsOneAndFour")
    public void massTestContainsOneAndFour(int[] in, boolean flag){
        assertEquals(flag,tasks.containsOneAndFour(in));
    }

}