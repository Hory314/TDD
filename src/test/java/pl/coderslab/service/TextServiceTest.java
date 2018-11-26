package pl.coderslab.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextServiceTest
{

    @Test
    public void halfForEvenTextTest()
    {
        //given
        String text = "HelloTDD";

        //when
        String result = TextService.halfText(text);

        //then
        assertEquals("Hell", result);
    }

    @Test
    public void halfForOddTextTest()
    {
        //given
        String text = "Hello TDD";

        //when
        String result = TextService.halfText(text);

        //then
        assertEquals("Hell", result);
    }
}