package pl.coderslab.service;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorsTest
{
    @Test
    public void generatePrimeFactorsTest()
    {
        // given
        int n = 99;
        int[] expected = {1, 3, 9, 11, 33, 99};

        // when
        int[] result = Factors.generatePrimeFactors(n);

        // then
        assertThat("Wrong result", result, is(expected));
    }
}
