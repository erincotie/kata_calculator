package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void emptyStringReturnsZeroString(){
        Calculator calc = new Calculator();
        assertEquals(calc.execute(""),"0");
    }
}