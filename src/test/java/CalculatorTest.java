import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
