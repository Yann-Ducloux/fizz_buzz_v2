package org.example;

public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final int MULTIPLE_OF_THREE = 3;
    public static final int ZERO = 0;
    public static final int MULTIPLE_OF_FIVE = 5;
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public String calcul(int number) {
        if(isAMultipleOf(MULTIPLE_OF_THREE, number) && isAMultipleOf(MULTIPLE_OF_FIVE, number)) {
            return FIZZ_BUZZ;
        }
        if(isAMultipleOf(MULTIPLE_OF_THREE, number)) {
            return FIZZ;
        }
        if(isAMultipleOf(MULTIPLE_OF_FIVE, number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isAMultipleOf(int multiple, int number) {
        return number % multiple == ZERO;
    }
}
