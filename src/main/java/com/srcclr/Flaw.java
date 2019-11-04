package com.srcclr;

import java.security.SecureRandom;
import java.util.Random;

public class Flaw {

    String password = "tests";
    Random insecureRand = new Random();
    double insecureRandDouble = insecureRand.nextDouble();
    SecureRandom secRand = new SecureRandom();
    double secureRandDouble3 = secRand.nextDouble();

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
