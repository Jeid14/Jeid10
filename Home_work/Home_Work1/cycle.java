package com.company;

import java.util.Scanner;

public class cycle {
    public int zadanie1() {
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
    public String zadanie2(double num){
        double res;
        boolean Da = true;
        String s = "";

        for (double i = 2; i <= num / 2; i++) {
            res = num % i;
            if (res == 0) {
                Da = false;
                break;
            }
        }
        if (Da == true) {
            s = "Простое";
        } else {
            s = "складное";
        }
        return s;
    }
    public double sQrt(double num) {
        double res;
        double sqrt = 0;
        for (double i = 1; i <= num; i++) {
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
    public double factorial(double num) {
        double fukt = 1;
        for (double i = 1; i <= num; i++) {
            fukt = fukt * i;
        }
        return fukt;
    }
    public int sumNumbs(int num) {
        int sum = 0;
        for (; num > 0; num = num / 10) {
            sum = sum + num % 10;
        }
        return sum;
    }
}
