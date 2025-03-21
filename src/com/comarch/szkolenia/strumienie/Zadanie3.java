package com.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,423,234,23,234,643,5,736,734,3,74,65,2,
                376,34,25,76,53,234,763,54,37);

        int sum = 0;
        int counter = 0;
        for(int element : list) {
            if(element % 2 == 0) {
                sum += element;
                counter++;
            }
        }

        System.out.println(((double) sum) / ((double) counter));


        list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(i -> i)
                .average()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma sredniej"));

    }
}
