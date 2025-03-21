package com.comarch.szkolenia.strumienie;

import com.comarch.szkolenia.optional.Car;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 1, 5, 6, 7, 0, 8, 9, 3, 10, 12, 9, 13);

        list.stream()
                .peek(i -> System.out.println("teraz mam i = " + i))
                .forEach(System.out::println);




        /*List<Car> cars = List.of(
                new Car("BMW", "3", "KR11"), //133
                new Car("Audi", "A5", "KR22"), //150
                new Car("Toyota", "Corolla", "KR33"), //180
                new Car("Kia", "Ceed", "KR44") //200
        );

        cars.stream().forEach(car -> car.setBrand("X"));

        for(Car car : cars) {
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.getPlate());
        }*/

        /*Car c1 = new Car("Y", "Y", "Z");
        Car c2 = new Car("X", "Y", "Z");

        Comparator<Car> carComparator = (car1, car2) -> car1.getBrand().compareTo(car2.getBrand());

        int result = carComparator.compare(c1,c2);
        System.out.println(result);*/

        /*metoda(1,2);
        metoda(1,2,3,4);
        metoda(1,2,3,4,5,6,7,8,9);*/
    }

    public static void metoda(int... ints) {
        for (int x : ints) {
            System.out.println(x);
        }
    }
}
