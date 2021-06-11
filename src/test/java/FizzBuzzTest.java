import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    @DisplayName("If number is not divisible by 3 or 5 it is returned")
    void fizzBuzzLeavesNormalNumbersAlone() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("1", fizzBuzz.convert(1));

    }

    @Test
    @DisplayName("If number is divisible by 3 AND 5 FizzBuzz is returned")
    void fizzBuzzConvertsMultiplesOfThreeAndFive() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }

    @Test
    @DisplayName("If number is divisible by 3 only Fizz is returned")
    void fizzBuzzConvertsMultiplesofThree() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Fizz", fizzBuzz.convert(3));


    }

    @Test
    @DisplayName("If number is divisible by 5 only Buzz is returned")
    void fizzBuzzConvertsMultiplesOfFive() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Buzz", fizzBuzz.convert(5));
        Assertions.assertEquals("Buzz", fizzBuzz.convert(55));
        Assertions.assertEquals("Buzz", fizzBuzz.convert(560));

    }
}