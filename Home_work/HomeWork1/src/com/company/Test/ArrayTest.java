package com.company.Test;

import com.company.java.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    Array arrays = new Array();

    @Test
    public void testGetMinElementArray1(){
        int [] array = {1,2,3,4,5};
        int ex = arrays.getMinElementArray(array);
        Assertions.assertEquals(ex,1);


    }
    @Test
    public void testGetMinElementArrayMinus(){
        int [] array = {111,2,3,4,-1};
        int ex = arrays.getMinElementArray(array);
        Assertions.assertEquals(ex,-11);


    }
    @Test
    public void testGetMinElementArrayOneElement(){
        int [] array = {1};
        int ex = arrays.getMinElementArray(array);
        Assertions.assertEquals(ex,1);

    }
    @Test
    public void testGetMaxElementArray(){
        int [] array = {1,2,3,4,5};
        int ex = arrays.getMaxElementArray(array);
        Assertions.assertEquals(ex,5);
    }
    @Test
    public void testGetMaxElementArray2(){
        int [] array = {1,2,5,4,1};
        int ex = arrays.getMaxElementArray(array);
        Assertions.assertEquals(ex,5);
    }
    @Test
    public void testGetMaxElementArray3(){
        int [] array = {0,0,0,-4,0};
        int ex = arrays.getMaxElementArray(array);
        Assertions.assertEquals(ex,0);
    }
    @Test
    public void testGetMinIndexArray(){
        int [] array = {0,0,0,-4,0};
        int ex = arrays.getMinIndexArray(array);
        Assertions.assertEquals(ex,3);
    }
    @Test
    public void testGetMinIndexArray1(){
        int [] array = {-4,0,0,5,0};
        int ex = arrays.getMinIndexArray(array);
        Assertions.assertEquals(ex,0);
    }
    @Test
    public void testGetMaxIndexArray(){
        int [] array = {-4,0,0,5,0};
        int ex = arrays.getMaxIndexArray(array);
        Assertions.assertEquals(ex,3);
    }
    @Test
    public void testGetSumUnevenArray(){
        int [] array = {-4,0,0,5,0};
        int ex = arrays.getSumUnevenIndexArray(array);
        Assertions.assertEquals(ex,5);
    }
    @Test
    public void testGetSumUnevenArrayMinus(){
        int [] array = {-4,1,1,-5,0};
        int ex = arrays.getSumUnevenIndexArray(array);
        Assertions.assertEquals(ex,-4);
    }
    @Test
    public void testGetReverseArray(){
        int [] array = {-4,1,1,-5,0};
        int[] ex = arrays.getReverse(array);
        int[] ac = {0,-5,1,1,-4};
        Assertions.assertArrayEquals(ex,ac);

    }
    @Test
    public void testGetReverseArray0(){
        int [] array = {0};
        int[] ex = arrays.getReverse(array);
        int[] ac = {0};
        Assertions.assertArrayEquals(ex,ac);

    }
    @Test
    public void testGetReverseArray2(){
        int [] array = {1,0,0,1};
        int[] ex = arrays.getReverse(array);
        int[] ac = {1,0,0,1};
        Assertions.assertArrayEquals(ex,ac);

    }
    @Test
    public void testGetOddElement(){
        int [] array = {1,0,0,1};
        int ex = arrays.getNumOddElements(array);
        Assertions.assertEquals(ex,2);

    }


    }