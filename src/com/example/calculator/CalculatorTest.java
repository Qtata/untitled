package com.example.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @org.junit.Test
    @Test
    public void testAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAddPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.add(2, -1));
    }

    @Test
    public void testAddWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(3, 0));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testAddLargeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1000000, calculator.add(500000, 500000));
    }
}
