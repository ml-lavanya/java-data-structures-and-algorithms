package com.practise.algorithms.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,6", "4,24", "5,120", "0,1"})
    void recursiveFactorial(int num, int factorialResult){
        assertEquals(factorialResult, factorial.recursiveFactorial(num));
    }
}