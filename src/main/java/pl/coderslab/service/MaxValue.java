package pl.coderslab.service;

public class MaxValue
{
    public static int largest(int[] list)
    {
        int index;

        if (list.length == 0)
        {
            throw new RuntimeException("Lista jest pusta");
        }
        int max = list[0];

        for (index = 0; index < list.length - 1; index++)
        {
            if (list[index] > max)
            {
                max = list[index];
            }
        }
        return max;
    }

}
