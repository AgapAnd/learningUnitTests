package ru.agapov.tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SwapValuesOfVariablesTest {
    @Test
    public void successfullySwapValuesOfTwoVariablesUsingTemporaryVariable() {
        int firstVar = 1;
        int secondVar = 2;
        int tempVar = 0;
        final int expectedValueOfFirstVariable = 2;
        final int expectedValueOfSecondVariable = 1;


        tempVar = firstVar;
        firstVar = secondVar;
        secondVar = tempVar;


        assertThat(firstVar, equalTo(expectedValueOfFirstVariable));
        assertThat(secondVar, equalTo(expectedValueOfSecondVariable));
    }

    @Test
    public void successfullySwapValuesOfTwoVariablesWithoutUsingTemporaryVariable() {
        int firstVar = 1;
        int secondVar = 2;
        final int expectedValueOfFirstVariable = 2;
        final int expectedValueOfSecondVariable = 1;


        firstVar += secondVar;
        secondVar = firstVar - secondVar;
        firstVar -= secondVar;


        assertThat(firstVar, equalTo(expectedValueOfFirstVariable));
        assertThat(secondVar, equalTo(expectedValueOfSecondVariable));
    }

    @Test
    public void successfullySwapValuesOfTwoVariablesUsingXOR() {
        int firstVar = 1;
        int secondVar = 2;
        final int expectedValueOfFirstVariable = 2;
        final int expectedValueOfSecondVariable = 1;


        firstVar ^= secondVar;
        secondVar ^= firstVar;
        firstVar ^= secondVar;


        assertThat(firstVar, equalTo(expectedValueOfFirstVariable));
        assertThat(secondVar, equalTo(expectedValueOfSecondVariable));
    }
}
