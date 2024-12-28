package com.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);

        System.out.println("Результат сложения " + a + " и " + b + " равен: " + result);
    }
}