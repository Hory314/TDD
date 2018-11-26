package pl.coderslab.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class CalculatorTest
{

    @Test
    public void addTest()
    {
        // given
        double a = 3.2;
        double b = 2.3;

        // when
        double result = Calculator.add(a, b);

        // then
        assertThat(result, is(5.5));
    }

    @Test
    public void subTest()
    {
        // given
        double a = 3.5;
        double b = 2.3;

        // when
        double result = Calculator.sub(a, b);

        // then
        assertEquals(1.2, result, 0.001);
    }

    @Test
    public void multTest()
    {
        // given
        double a = 3.2;
        double b = 2.3;

        // when
        double result = Calculator.mult(a, b);

        // then
        assertEquals(7.36, result, 0.0001);
    }

    @Test
    public void divTest()
    {
        // given
        double a = 2.1;
        double b = 0.1;

        // when
        double result = Calculator.div(a, b);

        // then
        assertEquals(21.0, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void divSecondParamIsZeroAndThrowsExTest()
    {
        // given
        double a = 2.1;
        double b = 0;

        // when
        Calculator.div(a, b);
    }

    @Test
    public void greaterTest()
    {
        //given
        int a = 8;
        int b = 10;

        // when
        boolean result = Calculator.greater(a, b);

        //then
        assertFalse("bad condition", result);
    }

    @Test
    public void evaluatesExpression()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);
    }
}