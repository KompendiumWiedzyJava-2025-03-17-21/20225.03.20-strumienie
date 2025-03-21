package com.comarch.szkolenia.strumienie;

import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        /*
        mamy liste stringow
        wypisz na ekranie stringi z doklejonym 'y' na koniec
        nie chcemy wypisywać stringów które zawierają "yy"
         */

        List<String> strings = List.of("a", "b", "c", "d", "y", "zy", "yz", "xx", "abc");

        for(String element : strings) {
            String newString = element + "y";
            if(!newString.contains("yy")) {
                System.out.println(newString);
            }
        }

        System.out.println("--------------------");

        strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .forEach(System.out::println);
    }
}
