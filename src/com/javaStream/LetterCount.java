package com.javaStream;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("A","B","c");
    }

    //1. Array elemanlarini almak => stream()
    //2. 5ten uzun isimleri filtrelemek => filter()
    //3. Geri kalan listedeki tum harflarin sayisini getirmek => mapToInt()
    //4. Harf sayilarini toplamak => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

        /*
         return Arrays.stream(names)
                .filter(name -> name.length() > 5) //Stream<String>
                .mapToInt(name ->name.length()) //Stream<Integer>
                .sum();
        */
      return Arrays.stream(names)
                .filter(name -> name.length() > 5) //Stream<String>
                .mapToInt(String::length) //Stream<Integer>
                .sum();

    }
}
