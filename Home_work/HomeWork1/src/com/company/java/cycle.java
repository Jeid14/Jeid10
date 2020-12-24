package com.company.java;

import java.util.Scanner;

public class cycle {
    public int getSumEvenNumbers() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum = sum + i;
            }
        }
        return sum;
    }
    public String chekSimpleNumbers(double num) {
        String result = " ";
        if (num == 0 || num == 1) {
            result = "Number need bigger 1";
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    result = "Number " + num + " is not simple.";
                    return result;
                }
            }
            result = "Number " + num + " is simple.";

        }
        return result;
    }
    public long sQrt(double num) {
        long res;
        long sqrt = 0L;
        for (long i = 1L; i <= num; i++) {
            res = i * i;
            if (res == num) {
                sqrt = i;
                break;
            }
            if ((res < num) & (res > num / 2)) {
                sqrt = i;
            }
        }
        return sqrt;
    }
    public long factorial(long num) {
        long fukt = 1L;
        for (long i = 1L; i <= num; i++) {
            fukt = fukt * i;
        }
        return fukt;
    }
    public int sumNumbs(int num) {
        num = Math.abs(num);
        int sum = 0;
        for (; num > 0; num = num / 10) {
            sum = sum + num % 10;
        }
        return sum;
    }

}
