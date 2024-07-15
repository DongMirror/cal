package com.study;

public class CalculatorImpl implements Calculator {

    @Override
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}
