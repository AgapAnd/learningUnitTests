package ru.agapov.tests;


import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ArraysTest {
    @Test
    public void successfullyReturnsStringRepresentationOfArray() {
        final int[] array = {1, 2, 3, 4, 5};
        final String expectedArrayStringRepresentation = "[1, 2, 3, 4, 5]";


        String arrayStringRepresentation = Arrays.toString(array);


        assertThat(arrayStringRepresentation, equalTo(expectedArrayStringRepresentation));
    }


    @Test
    public void successfullyReturnsDeepStringRepresentationOfArray() {
        final Object[] array = {1, new int[]{2, 3, 4}, 5, 6, new int[]{7, 8, 9, 10}};
        final String expectedArrayDeepStringRepresentation = "[1, [2, 3, 4], 5, 6, [7, 8, 9, 10]]";


        String arrayDeepStringRepresentation = Arrays.deepToString(array);


        assertThat(arrayDeepStringRepresentation, equalTo(expectedArrayDeepStringRepresentation));
    }
}
