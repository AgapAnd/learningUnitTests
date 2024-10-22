package ru.agapov.tests;

import org.junit.jupiter.api.Test;
import ru.agapov.utils.SwapUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SwapUtilTest {
    @Test
    public void successfullyReturnsSwappedValuesOfTwoVariables() {
        int firstVar = 1;
        int secondVar = 2;
        int expectedValueOfFirstVariable = 2;
        int expectedValueOfSecondVariable = 1;


        int[] arrayOfSwappedValuesOfVariables =
                SwapUtil.swapValuesOfTwoVariablesUsingTemporaryVariable(firstVar, secondVar);


        assertThat(arrayOfSwappedValuesOfVariables[0], equalTo(expectedValueOfFirstVariable));
        assertThat(arrayOfSwappedValuesOfVariables[1], equalTo(expectedValueOfSecondVariable));
    }
}
