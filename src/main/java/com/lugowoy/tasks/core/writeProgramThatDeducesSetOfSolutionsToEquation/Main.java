package com.lugowoy.tasks.core.writeProgramThatDeducesSetOfSolutionsToEquation;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import static java.lang.Math.*;

/** Created by Konstantin Lugowoy on 11.07.2017. */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter integer number \'a\' : ");
        int a = READING_DATA.read();

        System.out.println("Enter integer number \'b\' : ");
        int b = READING_DATA.read();

        System.out.println("Enter integer number \'c\' : ");
        int c = READING_DATA.read();

        double discriminant = getDiscriminant(a, b, c);
        if (discriminant < 0) {
            System.out.println("The equation has no roots.");
        } else if (discriminant == 0) {
            double x = (-b + sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has one root : " + x + " .");
        } else if (discriminant > 0) {
            double x1 = (-b + sqrt(discriminant)) / (2 * a);
            double x2 = (-b - sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has two roots.\n" +
                    "First root : %.2f .\n" +
                    "Second root : %.2f .", x1, x2);
        }

    }

    private static double getDiscriminant(int a, int b, int c) {
        return pow(b, 2) - 4 * a * c;
    }

}
