package com.company.taxi;

import java.util.Objects;

public class Cars extends Routs {
    private String model;
    private String color;
    private int numberOfSeats;
    private String number;

    public Cars() {
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getNumberOfSeats(), getNumber());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + getModel() +
                ",color=" + getColor() +
                ",numberOfSeats=" + getNumberOfSeats() +
                ",number=" + getNumber() +
                "}";
    }



}
