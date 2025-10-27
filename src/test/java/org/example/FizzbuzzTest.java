package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzbuzzTest {

    @ParameterizedTest(name = "Le nombre {0} doit retourner le même nombre")
    @ValueSource(ints = {1, 2})
    @DisplayName("Test FizzBuzz pour les nombres qui retournent le même nombre")
    void fizzbuzz_should_be_return_same_number(int number) {
        var numberExpected = String.valueOf(number);
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        var numberActual = fizzbuzz.convert(number);
        assertEquals(numberExpected, numberActual,
                () -> "Pour le nombre " + number + ", on attendait '" + numberExpected + "', mais on a eu '" + numberActual + "'");
    }

    @ParameterizedTest(name = "Le nombre {0} doit retourner 'Fizz'")
    @ValueSource(ints = {3, 6, 31, 32})
    @DisplayName("Test FizzBuzz pour les nombres qui retournent 'Fizz'")
    void fizzbuzz_should_be_return_fizz_when_is_divisible_or_contains_by_three(int number) {
        var numberExpected = "Fizz";
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        var numberActual = fizzbuzz.convert(number);
        assertEquals(numberExpected, numberActual,
                () -> "Pour le nombre " + number + ", on attendait '" + numberExpected + "', mais on a eu '" + numberActual + "'");
    }

    @ParameterizedTest(name = "Le nombre {0} doit retourner 'Buzz'")
    @ValueSource(ints = {5, 10, 52, 56})
    @DisplayName("Test FizzBuzz pour les nombres qui retournent 'Buzz'")
    void fizzbuzz_should_be_return_buzz_when_is_divisible_or_contains_by_five(int number) {
        var numberExpected = "Buzz";
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        var numberActual = fizzbuzz.convert(number);
        assertEquals(numberExpected, numberActual,
                () -> "Pour le nombre " + number + ", on attendait '" + numberExpected + "', mais on a eu '" + numberActual + "'");
    }

    @ParameterizedTest(name = "Le nombre {0} doit retourner 'FizzBuzz'")
    @ValueSource(ints = {15, 30})
    @DisplayName("Test FizzBuzz pour les nombres qui retournent 'FizzBuzz'")
    void fizzbuzz_should_be_return_fizzbuzz_when_is_divisible_by_five_and_three(int number) {
        var numberExpected = "FizzBuzz";
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        var numberActual = fizzbuzz.convert(number);
        assertEquals(numberExpected, numberActual,
                () -> "Pour le nombre " + number + ", on attendait '" + numberExpected + "', mais on a eu '" + numberActual + "'");
    }
}