package com.comarch.szkolenia.funkcyjny;

import java.sql.Connection;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        System.out.println(readFromFileAndCalculate1());
        System.out.println(readFromFileAndCalculate2());
        System.out.println(readFromFileAndCalculate3());

        readAndCalculate(App2::readFromFile, App2::calculate2);
        readAndCalculate(App2::readFromDB, App2::calculate3);
        readAndCalculate(App2::readFromWeb, App2::calculate1);

        /*readAndCalculate(() -> {
            Connection connection = ??
            return x;
        }, App2::calculate3);*/
    }

    public static int readFromFile() {
        return 5;
    }

    public static int readFromDB() {
        return 10;
    }

    public static int readFromWeb() {
        return 15;
    }

    public static int calculate1(int x) {
        return x * 5;
    }

    public static int calculate2(int x) {
        return x * 8;
    }

    public static int calculate3(int x) {
        return x * 12;
    }

    public static int readFromFileAndCalculate1() {
        int x = readFromFile();
        return calculate1(x);
    }

    public static int readFromFileAndCalculate2() {
        int x = readFromFile();
        return calculate2(x);
    }

    public static int readFromFileAndCalculate3() {
        int x = readFromFile();
        return calculate3(x);
    }

    public static int readAndCalculate(Supplier<Integer> reader, UnaryOperator<Integer> calculator) {
        int x = reader.get();
        return calculator.apply(x);
    }
}
