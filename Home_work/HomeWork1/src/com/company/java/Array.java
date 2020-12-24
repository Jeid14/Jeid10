package com.company.java;

import java.util.Arrays;

public class Array {

    public int getMinElementArray(int[] array) {

        int min = array[0];

        for (int i = 0; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public int getMaxElementArray(int[] array) {

        int max = array[0];

        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMinIndexArray(int[] array) {

        int min = array[0];
        int indexForMin = 0;
        for (int i = 0; i < array.length; i++) {
            int score = array[i];
            if (min > score) {
                min = score;
                indexForMin=i;
            }
        }

        return indexForMin;
    }

    public int getMaxIndexArray (int[] array){

        int max = array[0];
        int indexForMax = 0;
        for (int i = 0; i < array.length; i++) {
            int score = array[i];
            if (max < score) {
                max = score;
                indexForMax=i;
            }
        }

        return indexForMax;
    }

    public int getSumUnevenIndexArray(int[] array){

        int sum = 0;
        for (int i = 1; i < array.length; i += 2)
            sum += array[i];

        return sum;
    }

    public int[] getReverse(int[] array){

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public int getNumOddElements(int [] array) {

        int oddElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                {
                    ++oddElements;
                }
            }
        }
        return oddElements;
    }

    public String getReverseTwoParts(int [] array){

        int size = array.length / 2;
        int add1 = array.length % 2 == 0 ? 0 : 1;
        for(int i = 0; i < size; i++) {
            int add2 = array[size + i + add1];
            array[size + i + add1] = array[i];
            array[i] = add2;
        }
        return (Arrays.toString(array));
    }

    public String getSortArray(int [] array){

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return (Arrays.toString(array));
    }
}