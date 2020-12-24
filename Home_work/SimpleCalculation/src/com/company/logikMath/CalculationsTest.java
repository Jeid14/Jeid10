package com.company.logikMath;

import com.company.constants.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculationsTest {
    private final Calculations calculations = new Calculations();

    static Stream<Arguments> multiplyData() {
        return Stream.of(
                arguments(1, 5, 5),
                arguments(2, 0, 0),
                arguments(10, 20, 200),
                arguments(-1, 2, -2)
        );
    }

    @ParameterizedTest(name = "Plus. Input data is {0}, {1}")
    @MethodSource("multiplyData")
    void multiply(double num1, double num2, double res) {
        double act = calculations.multiplication(num1, num2);
        assertEquals(res, act);
    }

    static Stream<Arguments> divisionData() {
        return Stream.of(
                arguments(5, 1, 5),
                arguments(1, 2, 0.5),
                arguments(200, 10, 20),
                arguments(2, -1, -2),
                arguments(2, 0, Constants.DIVISION_NULL),
                arguments(1.2, 2, 0.6)
        );
    }

    @ParameterizedTest(name = "Input data is {0}, {1}")
    @MethodSource("divisionData")
    void division(double num1, double num2, double res) {
        double act = calculations.division(num1, num2);
        assertEquals(res, act);
    }

    static Stream<Arguments> additionData() {
        return Stream.of(
                arguments(5, 1, 6),
                arguments(1, -2, -1),
                arguments(200, 10, 210),
                arguments(2, -1, 1),
                arguments(2, 0,2),
                arguments(1.2, 2, 3.2)
        );
    }
    @ParameterizedTest(name = "Input data is {0}, {1}")
    @MethodSource("additionData")
    void addition(double num1, double num2, double res) {
        double act = calculations.addition(num1, num2);
        assertEquals(res, act);
    }

    static Stream<Arguments> subtractionData() {
        return Stream.of(
                arguments(5, 1, 4),
                arguments(1, -2, 3),
                arguments(200, 10, 190),
                arguments(-2, -1, -1),
                arguments(2, 0,2),
                arguments(1.2, 2, -0.8)
        );
    }

    @ParameterizedTest(name = "Input data is {0}, {1}")
    @MethodSource("subtractionData")
    void subtraction(double num1, double num2, double res) {
        double act = calculations.subtraction(num1, num2);
        assertEquals(res, act);
    }

    static Stream<Arguments> remainderData() {
        return Stream.of(
                arguments(5, 1, 0),
                arguments(1, -2, 1),
                arguments(200, 10, 0),
                arguments(2, 0,NaN),
                arguments(1.2, 2, 1.2)
        );
    }

    @ParameterizedTest(name = "Input data is {0}, {1}")
    @MethodSource("remainderData")
    void reemainder(double num1, double num2, double res) {
        double act = calculations.remainder(num1, num2);
        assertEquals(res, act);
    }



    }



