package com.comarch.szkolenia.anonimowe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Interfejs i = new Interfejs() {
            @Override
            public void m1() {
                System.out.println("metoda m1 !!!");
            }

            @Override
            public void m2() {
                System.out.println("Metoda m2 !!!");
            }
        };
        i.m1();
        i.m2();

        Interfejs x = new KlasaImplementujcaInterfejs();

        Interfejs i2 = new Interfejs() {
            @Override
            public void m1() {
                System.out.println("Inne m1 !!!");
            }

            @Override
            public void m2() {
                System.out.println("Inne m2 !!!");
            }
        };

        i2.m1();
        i2.m2();

        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cos sie dzieje !!!");
            }
        });
    }
}
