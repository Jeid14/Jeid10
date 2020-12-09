package com.company;

import org.junit.jupiter.api.Test;

public class cycleTest extends cycle{
    @Test
    public void zadanie1Test(){
        System.out.println(zadanie1());
    }
    @Test
    public void zadanie2Test(){
       double num = 27644437;
        System.out.println(zadanie2(num));
    }
    @Test
    public void sQrtTest(){
    double num = 999992228;
    System.out.println(sQrt(num));
    }
    @Test
    public void factorialTest(){
        double num = 100;
        System.out.println(factorial(num));
    }
    @Test
    public void sumNumbTest(){
        int num = 23222;
        System.out.println(sumNumbs(num));
    }

}
