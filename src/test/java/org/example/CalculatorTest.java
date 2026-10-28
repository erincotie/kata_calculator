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
        assertEquals("0", calc.add(""));
    }

    @Test
    void oneNumberStringReturnsSameString(){
        assertEquals("1", calc.add("1"));
    }

    @Test
    void notAnIntStringReturnsEmpty(){
        assertEquals("", calc.add("abc"));
    }

    @Test
    void twoNumbersSeparatedByCommasReturnsSumString(){
        assertEquals("3", calc.add("1,2"));
    }

    @Test
    void twoNumbersNotSeparatedByCommasReturnsEmpty(){
        assertEquals("", calc.add("1.2"));
    }

    @Test
    void moreThanTwoNumbersSeparatedByCommasReturnsSumString(){
        assertEquals("10", calc.add("1,2,3,4"));
    }

    @Test
    void twoFloatsReturnsSumString(){
        assertEquals("3.3", calc.add("1.2,2.1"));
    }

    @Test
    void twoNumbersSpecifyingSeparatorReturnsSum(){
        assertEquals("6", calc.add("//;\n1;2;3"));
    }

    @Test
    void specifyinfSeparatorIsTwoCharReturnsSum(){
        assertEquals("6", calc.add("//::\n1::2::3"));
    }
}