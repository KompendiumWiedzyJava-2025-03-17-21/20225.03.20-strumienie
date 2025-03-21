package com.comarch.szkolenia.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Optional<Car> carBox = findCar("Audi");
        if(carBox.isPresent()) {
            System.out.println(carBox.get().getBrand());
            System.out.println(carBox.get().getModel());
            System.out.println(carBox.get().getPlate());
        }

        Car car = carBox.orElse(new Car("Default", "Default", "Default"));

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPlate());

        Supplier<Car> defaultCarSupplier = () -> new Car("Default", "Default", "Default");
        Car car2 = carBox.orElseGet(App::defaultCar);

        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getPlate());

        System.out.println(carBox.map(Car::getBrand).orElse("Inny string"));

        carBox.ifPresent(c -> {
            System.out.println(c.getBrand());
            System.out.println(c.getModel());
            System.out.println(c.getPlate());
        });

        carBox.ifPresentOrElse(
                c -> System.out.println(c.getPlate()),
                () -> System.out.println("Nie ma auta !!"));
    }

    public static Optional<Car> findCar(String brand) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", "KR11"));
        cars.add(new Car("Audi", "A5", "KR22"));
        cars.add(new Car("Toyota", "Corolla", "KR33"));
        cars.add(new Car("Kia", "Ceed", "KR44"));

        for (Car car : cars) {
            if(car.getBrand().equals(brand)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }

    public static Car defaultCar() {
        System.out.println("Generuje jakis samochod !!");
        return new Car("Default", "Default", "Default");
    }
}
