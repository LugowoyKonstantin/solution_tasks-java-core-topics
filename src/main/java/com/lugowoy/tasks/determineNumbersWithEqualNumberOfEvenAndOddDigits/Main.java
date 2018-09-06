package com.lugowoy.tasks.determineNumbersWithEqualNumberOfEvenAndOddDigits;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 06.09.2018 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> integerArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                       new FillingArrayRandomIntegerNumbers().fill(lengthArray, Integer.MAX_VALUE));

        System.out.println("Numbers : " + integerArray);

        Array<Integer> resultArray = determineNumbersWithEqualNumberOfEvenAndOddDigits(integerArray);
        System.out.print("Result numbers : ");
        if (resultArray.getLength() > 0) {
            System.out.print(resultArray);
            System.out.println();
        } else {
            System.out.println("No matching matched numbers.");
        }

    }

    private static Array<Integer> determineNumbersWithEqualNumberOfEvenAndOddDigits(Array<Integer> integerArray) {
        Array<Integer> resultArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(0);
        int counterEvenNumbers = 0, counterOddNumbers = 0;
        for (int i = 0; i < integerArray.getLength(); i++) {
            int number = integerArray.get(i);
            while (number > 0) {
                int tmpNumber = number % 10;
                if (tmpNumber % 2 == 0) {
                    counterEvenNumbers++;
                } else {
                    counterOddNumbers++;
                }
                number /= 10;
            }
            if (counterEvenNumbers == counterOddNumbers) {
                resultArray.add(integerArray.get(i));
            }
        }
        return resultArray;
    }

}
