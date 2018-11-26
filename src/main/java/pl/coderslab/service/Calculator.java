package pl.coderslab.service;

import java.util.StringTokenizer;

public class Calculator
{
    public static double add(double a, double b)
    {
        return a + b;
    }

    public static double sub(double a, double b)
    {
        return a - b;
    }

    public static double mult(double a, double b)
    {
        return a * b;
    }

    public static double div(double a, double b)
    {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }

    public static boolean greater(int a, int b)
    {
        return a > b;
    }

    public int eval(String s)
    {
        int sum = 0;
        StringTokenizer st = new StringTokenizer(s, "+");
        while (st.hasMoreTokens())
        {
            int val = Integer.parseInt(st.nextToken());
            sum += val;
        }
        return sum;
    }
}
