import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("If number is not divisible by 3 or 5 it is returned")
    void fizzBuzzLeavesNormalNumbersAlone() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("1", fizzBuzz.convert(1));
        Assertions.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    @DisplayName("If number is divisible by 3 AND 5 FizzBuzz is returned")
    void fizzBuzzConvertsMultiplesOfThreeAndFive() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    @DisplayName("If number is divisble by 3 only Fizz is returned")
    void fizzBuzzConvertsMultiplesofThree() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    void fizz() {
    }
}