package ru.agapov.utils;

public class SwapUtil {
    public static int[] swapValuesOfTwoVariablesUsingTemporaryVariable(int firstVar, int secondVar) {
        int tempVar = firstVar;
        firstVar = secondVar;
        secondVar = tempVar;
        return new int[]{firstVar, secondVar};
    }
}
