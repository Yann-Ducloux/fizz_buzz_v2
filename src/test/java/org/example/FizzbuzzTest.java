package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzbuzzTest {
    @ParameterizedTest(name = "Le nombre {0} doit retourner le même nombre")
    @ValueSource(ints = {1, 2})
    @DisplayName("Test FizzBuzz pour les nombres qui retournent le même nombre")
    void fizzbuzz_should_be_return_same_number(int number) {
        var numberExpected = number;
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        var numberActual = fizzbuzz.calcul(number);
        assertEquals(numberExpected, numberActual,
                () -> "Pour le nombre " + number + ", on attendait '" + numberExpected + "', mais on a eu '" + numberActual + "'");
    }
}