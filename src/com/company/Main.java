package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Transformare grade Celsius in grade Fahrenheit
        Scanner scan= new Scanner(System.in);
        System.out.println("Introduceti temperatura in Celsius");
        float gradeCelsius=scan.nextFloat();
        float gradeFahrenheit=(gradeCelsius*(9f/5)+32);
        System.out.println(gradeCelsius+" grade Celsius reprezinta "+gradeFahrenheit + "grade Fahrenheit");
    }
}

