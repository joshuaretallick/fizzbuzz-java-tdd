import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz enteredValue = new FizzBuzz();

    @Test
    @DisplayName("If number is not divisible by 3 or 5 it is returned")
    void fizzBuzzLeavesNormalNumbersAlone() {

        Assertions.assertEquals("1", enteredValue.fizzBuzzConverter(1));

    }

    @Test
    @DisplayName("If number is divisible by 3 AND 5 FizzBuzz is returned")
    void fizzBuzzConvertsMultiplesOfThreeAndFive() {

        Assertions.assertEquals("FizzBuzz", enteredValue.fizzBuzzConverter(15));

    }

    @Test
    @DisplayName("If number is divisible by 3 only Fizz is returned")
    void fizzBuzzConvertsMultiplesOfThree() {

        Assertions.assertEquals("Fizz", enteredValue.fizzBuzzConverter(3));


    }

    @Test
    @DisplayName("If number is divisible by 5 only Buzz is returned")
    void fizzBuzzConvertsMultiplesOfFive() {

        Assertions.assertEquals("Buzz", enteredValue.fizzBuzzConverter(5));

    }

}