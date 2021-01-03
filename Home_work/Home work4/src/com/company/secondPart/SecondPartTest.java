package com.company.secondPart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondPartTest {
    SecondPart secondPart = new SecondPart();

   @Test
   void wholeNumbToStringTest() {
       long value = 150;

       String ex = secondPart.wholeNumbToString(value);
       Assertions.assertEquals(ex,"150");
    }
    @Test
    void wholeNumbToStringTestNULL() {
        long value = 0;

        String ex = secondPart.wholeNumbToString(value);
        Assertions.assertEquals(ex,"0");
    }
    @Test
    void numbsToStringTestNULL() {
        double value = 0;

        String ex = secondPart.numbsToString(value);
        Assertions.assertEquals(ex,"0.0");
    }
    @Test
    void numbsToStringTestMinus() {
        double value = -6;

        String ex = secondPart.numbsToString(value);
        Assertions.assertEquals(ex,"-6.0");
    }
    @Test
    void numbsToStringTest() {
        double value = -1.88;

        String ex = secondPart.numbsToString(value);
        Assertions.assertEquals(ex,"-1.88");
    }
    @Test
    void stringToWholeNumbTest() {
        String value = "1.45";
        double ex = secondPart.stringToDouble(value);
        Assertions.assertEquals(ex,1.45);
    }
    @Test
    void stringToWholeNumbTestNULL() {
        String value = "0";
        double ex = secondPart.stringToDouble(value);
        Assertions.assertEquals(ex,0.0);
    }
    @Test
    void stringToWholeNumbTest2() {
        String value = "0.5";
        double ex = secondPart.stringToDouble(value);
        Assertions.assertEquals(ex,0.5);
    }

}

