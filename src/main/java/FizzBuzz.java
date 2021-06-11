import java.util.Scanner;

public class FizzBuzz {

    public String fizzBuzzConverter(int number) {

        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        return String.valueOf(number);

    }

    public static void main(String[] args) {

    }
}
