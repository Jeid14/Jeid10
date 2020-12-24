package com.company.logikMath;

import com.company.constants.Constants;

public class Calculations {
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException(Constants.DIVISION_NULL);
        }

        return num1 / num2;
    }

    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double remainder(double num1, double num2) {
        return num1 % num2;
    }
}

