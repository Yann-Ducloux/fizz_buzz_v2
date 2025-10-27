package org.example;

public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final int MULTIPLE_OF_THREE = 3;
    public static final int ZERO = 0;
    public static final int MULTIPLE_OF_FIVE = 5;
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;
    public static final String THREE = "3";
    public static final String FIVE = "5";
    public static final int START_LIST_FIZZ_BUZZ = 1;

    public void compute(int number) {
        for (int i = START_LIST_FIZZ_BUZZ; i <= number; i++) {
            System.out.println(i + " => " + convert(i));
        }
    }

    public String convert(int number) {
        String numberString = String.valueOf(number);
        if(isAMultipleOf(MULTIPLE_OF_THREE, number) && isAMultipleOf(MULTIPLE_OF_FIVE, number)) {
            return FIZZ_BUZZ;
        }
        if(isAMultipleOf(MULTIPLE_OF_THREE, number) || numberString.contains(THREE)) {
            return FIZZ;
        }
        if(isAMultipleOf(MULTIPLE_OF_FIVE, number) || numberString.contains(FIVE)) {
            return BUZZ;
        }
        return numberString;
    }

    private static boolean isAMultipleOf(int multiple, int number) {
        return number % multiple == ZERO;
    }
}
