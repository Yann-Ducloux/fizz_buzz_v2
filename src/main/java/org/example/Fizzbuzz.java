package org.example;

public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final int MULTIPLE_OF_THREE = 3;
    public static final int ZERO = 0;

    public String calcul(int number) {
        if(number % MULTIPLE_OF_THREE == ZERO) {
            return FIZZ;
        }
        return String.valueOf(number);
    }
}
