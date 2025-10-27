package org.example;

public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final int MULTIPLE_OF_THREE = 3;
    public static final int ZERO = 0;
    public static final int MULTIPLE_OF_FIVE = 5;
    public static final String BUZZ = "Buzz";

    public String calcul(int number) {
        if(number % MULTIPLE_OF_THREE == ZERO) {
            return FIZZ;
        }
        if(number % MULTIPLE_OF_FIVE == ZERO) {
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
