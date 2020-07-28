import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    @Test
    void calculatorCanAdd(){
        Assertions.assertEquals(Calculator.add(2,2), 4);
    }

    @Test
    void calculatorCanRemove(){
        Assertions.assertTrue(Calculator.subtract(5,1) == 4);
    }

    @Test
    void calculatorCanMultiply(){
        Assertions.assertEquals(Calculator.multiply(3,5), 15);
    }

    @Test
    void calculatorCanDivide(){
        Assertions.assertEquals(Calculator.divide(15,3),5);
    }

    @Test
    void containsHamcrest(){
        List<String> list = Arrays.asList("hello", "netology", "world");
        Matchers.contains(list, Matchers.hasItems("hello", "netology"));
    }

    @Test
    void closeToHamcrest(){
        MatcherAssert.assertThat(10.3, Matchers.closeTo(10.3, 0.3));
    }
}
