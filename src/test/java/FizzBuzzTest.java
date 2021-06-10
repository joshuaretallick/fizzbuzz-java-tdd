import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void fizzBuzzLeavesNormalNumbersAlone() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("1", fizzBuzz.convert(1));
        Assertions.assertEquals("2", fizzBuzz.convert(2));
    }
    
    @Test
    void fizzBuzzConvertsMultiplesofThree() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("fizz", fizzBuzz.convert(3));

    }
}