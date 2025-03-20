package com.comarch.szkolenia.funkcyjny;

import java.nio.charset.StandardCharsets;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        /*Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };*/

        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Mateusz"));
        System.out.println(function.apply("Janusz"));
        System.out.println(function.apply("Zbyszek"));

        /*MojaFunkcja mojaFunkcja = new MojaFunkcja();
        mojaFunkcja.apply(5);

        function.apply(5);*/

        /*UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String string) {
                return "to jest string: " + string;
            }
        };*/

        UnaryOperator<String> unaryOperator = App::addText;

        System.out.println(unaryOperator.apply("cos"));
        System.out.println(unaryOperator.apply("cos innego"));


        /*BiFunction<String, String, Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String string, String string2) {
                return string.length() + string2.length();
            }
        };*/

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();

        System.out.println(biFunction.apply("Jan", "Wiesiek"));
        System.out.println(biFunction.apply("Zbyszek", "Janusz"));

        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.length() > 10;
            }
        };*/

        Predicate<String> predicate = s -> s.length() > 10;

        System.out.println(predicate.test("Mateusz"));
        System.out.println(predicate.test("Janusz"));
        System.out.println(predicate.test("Magdalena"));

        /*Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "default";
            }
        };*/

        Supplier<String> supplier = () -> "default";

        System.out.println(supplier.get());
        System.out.println(supplier.get());

        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };*/

        Consumer<String> consumer = System.out::println;

        consumer.accept("ABC");
        consumer.accept("XYZ");
        consumer.accept(supplier.get());

        Function<String, Integer> function2 = s -> {
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            int sum = 0;
            for (byte b: bytes) {
                sum = sum + b;
            }

            return sum;
        };

        System.out.println(function2.apply("Mateusz"));
    }

    public static String addText(String s) {
        return "to jest string: " + s;
    }
}
