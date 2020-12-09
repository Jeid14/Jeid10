package com.company;

import org.junit.jupiter.api.Test;

public class Conditional1Test extends Conditional1{
    @Test
    public void evenTest(){
        int a = 1;
        int b = 4;
        System.out.println(even(a,b));

    }
    @Test
    public void coordinatTest(){
        int x = -2;
        int y = -888;
        System.out.println(coordinat(x,y));
    }
    @Test
    public void jPTest(){
        int x = 2;
        int y = 1;
        int z = 2;
        System.out.println(justPositive(x,y,z));
    }
    @Test
    public void zadanie4Test(){
        int x =1;
        int y=1;
        int z=8;
        System.out.println(zadanie4(x,y,z));
    }
    @Test
    public void zadanie5(){
        int a = 100;
        System.out.println(zadanie5(a));
    }
}
