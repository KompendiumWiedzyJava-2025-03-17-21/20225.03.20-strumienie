package com.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        mamy liste liczb
        chcemy miec nową liste liczb
        nowa lista ma nie zawierac duplikatow
        chcemy tylko liczby > 3
        chcemy tylko liczby < 7
         */

        List<Integer> list = List.of(1,2,3,4,7,4,7,2,7,2,6,9,3,3,1,6,9,3);

        List<Integer> newList = new ArrayList<>();
        for (int element : list) {
            if(element > 3 && element < 7 && !newList.contains(element)) {
                newList.add(element);
            }
        }

        System.out.println(newList);

        List<Integer> newList2 = list.stream()
                .filter(x -> x > 3 && x < 7)
                .distinct()
                .toList();
        System.out.println(newList2);
    }
}
