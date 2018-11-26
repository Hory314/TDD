package pl.coderslab.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcServiceTest
{

    @Test
    public void sumTest()
    {
        // given
        double a = 2;
        double b = 3;

        // when
        double result = CalcService.sum(a, b);

        //then
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void powTest()
    {
        // given
        double a = 2;
        int b = 3;

        // when
        double result = CalcService.pow(a, b);

        //then
        assertEquals(8, result, 0.0001);
    }

    @Test
    public void sqrtTest()
    {
        //give
        double a = 16;

        //when
        double result = CalcService.sqrt(a);

        //then
        assertEquals(4, result, 0.0001);

    }
}