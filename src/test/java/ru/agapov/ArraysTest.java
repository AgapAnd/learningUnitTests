package ru.agapov;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class is intended for testing behavior of class Arrays
 */

public class ArraysTest {
    @Test
    public void successfullyReturnsStringRepresentationOfArray() {
        int[] array = {1,2,3,4,5};
        String expectedArrayStringRepresentation = "[1, 2, 3, 4, 5]";
        String arrayStringRepresentation = Arrays.toString(array);


        assertThat(arrayStringRepresentation).isEqualTo(expectedArrayStringRepresentation);
    }
}
