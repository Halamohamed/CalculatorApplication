
import org.junit.jupiter.api.Assertions;
import se.lexicon.CalculatorV2;



import org.junit.jupiter.api.Test;

public class CalculatorV2Test {

    CalculatorV2 calculator = new CalculatorV2();

    @Test
    public void addition(){

        double[] numbers = {2.5,3.5,7.5,9.0};
        double result = 22.5;
        Assertions.assertEquals(result, calculator.addition(numbers));

    }

    @Test
    public void substraction(){

        double[] numbers = {22.5,3.5,7.5,9.0};
        double result = 2.5;
        Assertions.assertEquals(result, calculator.subtraction(numbers));

    }

   @Test
   public void multiplication(){

       double number1 = 34;
       double number2 = 4;
       double expected = 136;
       Assertions.assertEquals(expected, calculator.multiplication(number1,number2));

   }
    @Test
    public void division(){

        double number1 = 34;
        double number2 = 4;
        double expected = 8.5;
        Assertions.assertEquals(expected, calculator.division(number1,number2));

    }

}
