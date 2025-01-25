package com.example.tddtraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assertions.assertEquals(10, five.amount);
    }
}
