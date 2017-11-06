package com.lugowoy.tasks.outputPrimeNumbersInCertainRange;

/** Created by Konstantin Lugowoy on 31.10.2017. */

public class Main {

    private static final int BOUND = 10_000_000;

    public static void main(String[] args) {

        for (int i = 1; i < BOUND; i++) {
            int number = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    number++;
                }
            }
            if (number <= 2) {
                if (i != 1) {
                    System.out.print(i + " ");
                }
            }
        }


    }

}