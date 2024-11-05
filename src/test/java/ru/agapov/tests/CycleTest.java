package ru.agapov.tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CycleTest {
    @Test
    public void successfullyOutputsValuesOfVariableOfIndexOfCycle() {
        final String expectedValuesOfVariableOfIndexOfCycle = "0123456789";
        StringBuilder valuesOfVariableOfIndexOfCycle = new StringBuilder();


        for (int indexOfCycle = 0; indexOfCycle < 10; indexOfCycle++) {
            valuesOfVariableOfIndexOfCycle.append(indexOfCycle);
        }


        assertThat(expectedValuesOfVariableOfIndexOfCycle, equalTo(valuesOfVariableOfIndexOfCycle.toString()));
    }
    @Test
    public void successfullyOutputsValuesOfVariableOfIndexOfCycleWithIncrementOfTwo() {
        final String expectedValuesOfVariableOfIndexOfCycle = "02468";
        StringBuilder valuesOfVariableOfIndexOfCycle = new StringBuilder();


        for (int indexOfCycle = 0; indexOfCycle < 10; indexOfCycle += 2) {
            valuesOfVariableOfIndexOfCycle.append(indexOfCycle);
        }


        assertThat(expectedValuesOfVariableOfIndexOfCycle, equalTo(valuesOfVariableOfIndexOfCycle.toString()));
    }

    @Test
    public void successfullyOutputsValuesOfVariableOfIndexOfCycleInReverseOrder() {
        final String expectedValuesOfVariableOfIndexOfCycle = "9876543210";
        StringBuilder valuesOfVariableOfIndexOfCycle = new StringBuilder();


        for (int indexOfCycle = 9; indexOfCycle >= 0; indexOfCycle--) {
            valuesOfVariableOfIndexOfCycle.append(indexOfCycle);
        }


        assertThat(expectedValuesOfVariableOfIndexOfCycle, equalTo(valuesOfVariableOfIndexOfCycle.toString()));
    }
}
