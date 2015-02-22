package com.bluesquare.calculator;

public class Calculator {

    public Result add(int value1, int value2) {
        return new Result((value1 + value2), "SUCCESS");
    }

    public Result subtract(int value1, int value2) {
        return new Result((value1 - value2), "SUCCESS");
    }

    public Result multiply(int value1, int value2) {
        return new Result((value1 * value2), "SUCCESS");
    }

    public Result divide(int value1, int value2) {
        return new Result((value1 / value2), "SUCCESS");
    }
}
