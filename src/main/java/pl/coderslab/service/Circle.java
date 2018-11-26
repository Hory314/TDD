package pl.coderslab.service;

public class Circle
{

    public double circleArea(double r)
    {
        if (r < 0) throw new IllegalArgumentException();
        return Math.round(Math.PI * r * r * 100.0) / 100.0;
    }
}
