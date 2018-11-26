package pl.coderslab.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest
{

    @Test
    public void addTest()
    {
        // given
        int a = 2;
        int b = 3;

        //when
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(a, b);

        //then
        assertThat("wrong result", result, is(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPositveWrongSecondParamsTest()
    {
        //given
        int a = 3;
        int b = -4;

        //when
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.addPositve(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPositveWrongFirstParamsTest()
    {
        //given
        int a = -3;
        int b = 4;

        //when
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.addPositve(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPositveWrongAllParamsTest()
    {
        //given
        int a = -3;
        int b = -4;

        //when
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.addPositve(a, b);
    }

    @Test
    public void addPositveGoodAllParamsTest()
    {
        //given
        int a = 3;
        int b = 4;

        //when
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addPositve(a, b);

        //then
        assertThat(result, is(7));
    }
}