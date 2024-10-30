package ru.agapov.tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CycleTest {
    @Test
    public void successfullyReturnsValuesOfIndexOfCycle() {
        final int[] expectedValuesOfCycleIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] valuesOfCycleIndex = new int[10];


        for (int i = 0; i < 10; i++) {
            valuesOfCycleIndex[i] = i;
        }

        
        assertThat(valuesOfCycleIndex, equalTo(expectedValuesOfCycleIndex));
    }
}
