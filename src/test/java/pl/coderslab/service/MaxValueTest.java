package pl.coderslab.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxValueTest
{

    @Test(expected = RuntimeException.class)
    public void largestEmptyListParamTest()
    {
        //given
        int[] list = {};

        // when
        MaxValue.largest(list);
    }

    @Test
    public void largestTest()
    {
        //given
        int[] list = {4, 6, 8, 3, 1, -77, -2};

        //when
        int result = MaxValue.largest(list);

        //then
        assertThat(result, is(8));
    }
}