import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void fizzBuzzLeavesNormalNumbersAlone() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void fizzBuzzReturnsFizzWhenDivisibleByThree() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("3", fizzBuzz.convert(3));
    }
}