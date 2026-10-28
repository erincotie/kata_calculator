package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void crearCalc(){
        calc = new Calculator();
    }
    @Test
    void emptyStringReturnsZeroString(){
        assertEquals(calc.add(""),"0");
    }

    @Test
    void oneNumberStringReturnsSameString(){
        assertEquals(calc.add("1"), "1");
    }

    @Test
    void notAnIntStringReturnsEmpty(){
        assertEquals(calc.add("abc"), "");
    }

    @Test
    void twoNumbersSeparatedByCommasReturnsSumString(){
        assertEquals(calc.add("1,2"),"3");
    }

    @Test
    void twoNumbersNotSeparatedByCommasReturnsEmpty(){
        assertEquals(calc.add("1.2"),"");
    }

    @Test
    void moreThanTwoNumbersSeparatedByCommasReturnsSumString(){
        assertEquals(calc.add("1,2,3,4"),"10");
    }
}