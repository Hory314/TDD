package pl.coderslab.service.testSuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.coderslab.service.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({CalcServiceTest.class,
        TextServiceTest.class,
        FirstTest.class,
        SimpleCalculatorTest.class,
        MaxValueTest.class,
        CalculatorTest.class})
public class AllTests
{
}
