package com.company.taxi;

import java.util.Objects;

public class Drivers {
    private String name;
    private int experience;
    private int startWorkYear;
    // private int ;
    // private LocalDate birthDate;

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

    public int getStartWorkYear() {
        return startWorkYear;
    }
    public void setStartWorkYear(int startWorkYear) {
        this.startWorkYear = startWorkYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExperience(), getStartWorkYear());
    }
    @Override
    public String toString() {
        return "Driver{" +
                "name=" + getName() +
                ",experience=" + getExperience() +
                ",year=" + getStartWorkYear() +
                "}";
    }
}
