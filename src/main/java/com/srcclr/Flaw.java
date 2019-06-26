package com.srcclr;

import java.security.SecureRandom;
import java.util.Random;

public class Flaw {

    //String otherpassword = "tests";
    String thing = "test";
    Random rand = new Random();
    SecureRandom secRand = new SecureRandom();
    double randDouble = rand.nextDouble();
    double randDouble2 = rand.nextDouble();
    double secureRandDouble3 = secRand.nextDouble();
    //double someDouble = 1.0;

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
