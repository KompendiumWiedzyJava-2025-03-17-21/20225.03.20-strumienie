package com.comarch.szkolenia.optional;

public class Car {
    private String brand;
    private String model;
    private String plate;

    public Car(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
