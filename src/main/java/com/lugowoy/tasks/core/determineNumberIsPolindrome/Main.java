package com.lugowoy.tasks.core.determineNumberIsPolindrome;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 03.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter a number to determine if it is a palindrome : ");
        int number = READER.readInt();

        Determinator<Integer> determinator = Determinator::determineNumberIsPolindrome;

        if (determinator.determine(number)) {
            System.out.printf("Number %d is a polindrome.", number);
        } else {
            System.out.printf("Number %d is a not polindrome.", number);
        }

    }

}
