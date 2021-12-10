package com.company.taxi;

import java.util.Objects;

public class Drivers {
    private String name;
    private int experience;
    private int year;

    public Drivers () {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExperience(), getYear());
    }
    @Override
    public String toString() {
        return "Driver{" +
                "name=" + getName() +
                ",experience=" + getExperience() +
                ",year=" + getYear() +
                "}";
    }
}
