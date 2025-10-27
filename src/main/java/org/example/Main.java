package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ecrire un nombre: ");
        var nombre = sc.nextInt();
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        fizzbuzz.compute(nombre);
    }
}
