package com.company.Test;

import com.company.java.cycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cycleTest extends cycle {
    @Test
    public void getSumEvenNumbersTest() {
        Assertions.assertEquals(getSumEvenNumbers(), 2450);
    }

    @Test
    public void chekSimpleNumbersTest0() {
        double num = 0;
        String s = chekSimpleNumbers(num);
        Assertions.assertEquals(s, "Number need bigger 1");

    }

    @Test
    public void chekSimpleNumbersTest1() {
        double num = 1;
        String s = chekSimpleNumbers(num);
        Assertions.assertEquals(s, "Number need bigger 1");

    }

    @Test
    public void chekSimpleNumbersTest() {
        double num = 191;
        String s = chekSimpleNumbers(num);
        Assertions.assertEquals(s, "Number " + num + " is simple.");

    }

    @Test
    public void sQrtTest() {
        long num = 16;
        long res = sQrt(num);
        Assertions.assertEquals(res, 4);
    }

    @Test
    public void sQrtTest0() {
        long num = 0;
        long res = sQrt(num);
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void sQrtTest1() {
        long num = 1;
        long res = sQrt(num);
        Assertions.assertEquals(res, 1);
    }

    @Test
    public void sQrtTest2() {
        long num = 143;
        long res = sQrt(num);
        Assertions.assertEquals(res, 11);
    }

    @Test
    public void factorialTest0() {
        long num = 50;
        long res = factorial(num);
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void testGetSumNumbers1() {
        int num = 66;
        int ex = sumNumbs(num);

        Assertions.assertEquals(ex, 12);

    }

    @Test
    public void testGetSumNumbers0() {
        int num = 0;
        int ex = sumNumbs(num);

        Assertions.assertEquals(ex, 0);

    }
    @Test
    public void testGetSumNumbersMinus() {
        int num = -66;
        int ex = sumNumbs(num);

        Assertions.assertEquals(ex, 12);

    }
    @Test
    public void testGetSumNumbers5Znakov() {
        int num = 11111;
        int ex = sumNumbs(num);

        Assertions.assertEquals(ex, 5);

    }

}


