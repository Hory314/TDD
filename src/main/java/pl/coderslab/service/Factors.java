package pl.coderslab.service;

import java.util.Arrays;

public class Factors
{

    public static int[] generatePrimeFactors(int n)
    {
        int[] result = new int[]{};

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }

        return result;
    }
}
