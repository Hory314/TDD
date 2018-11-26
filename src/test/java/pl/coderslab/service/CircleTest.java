package pl.coderslab.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CircleTest
{
    @Test
    public void circleAreaTest()
    {
        //given
        double r = 17.8;
        // double expected = Math.round(995.382216363 * 100.0) / 100.0; // 995.38
        double expected = 995.38;

        //when
        Circle circle = new Circle();
        double result = circle.circleArea(r);

        //then
        assertThat("Wrong result",result,is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleAreaNegativeParamTest()
    {
        //given
        double r = -4.3;

        // when
        Circle circle = new Circle();
        circle.circleArea(r);
    }
}
