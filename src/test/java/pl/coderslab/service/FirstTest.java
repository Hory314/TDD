package pl.coderslab.service;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class FirstTest
{

    @Test
    public void concatString()
    {
        //given
        String text1 = "Hello";
        String text2 = "Java";

        //when
        First first = new First();
        String result = first.concatString(text1, text2);

        //then
        assertThat("Wrong concatenation", result, is("HelloJava"));
    }

    @Test
    public void multiply()
    {
        //given
        int a = 2;
        int b = 4;

        //when
        First first = new First();
        int result = first.multiply(a, b);

        //then
        assertThat("Wrong result", result, is(8));
    }
}