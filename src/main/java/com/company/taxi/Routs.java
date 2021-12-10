package com.company.taxi;

import java.util.Objects;

public class Routs {
    private Cars car;
    private Drivers driver;
    private String address;
    private int sum_routs;

    public Routs () {
    }

    public Cars getCar(){
        return car;
    }
    public void setCar(Cars car) {
        this.car = car;
    }
    public Drivers getDriver(){
        return driver;
    }
    public void setDriver(Drivers driver) {
        this.driver = driver;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSum_routs(){
        return sum_routs;
    }
    public void setSum_routs(int sum_routs) {
        this.sum_routs = sum_routs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Routs routs = (Routs) o;
        return Objects.equals(getCar(),routs.getCar())
                && Objects.equals(getDriver(),routs.getDriver())
                && Objects.equals(getAddress(),routs.getAddress())
                && Objects.equals(getSum_routs(),routs.getSum_routs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCar(), getDriver(), getAddress(), getSum_routs());
    }

    @Override
    public String toString() {
        return  getCar() +
                " " + getDriver() +
                ",address=" + getAddress() +
                ",sum_routs=" + getSum_routs() +
                "}";
    }

    public static class RoutsBuilder {
        private Routs routs = new Routs();

        public RoutsBuilder setCar(Cars car) {
            routs.setCar(car);
            return this;
        }
        public RoutsBuilder setDriver(Drivers driver) {
            routs.setDriver(driver);
            return this;
        }
        public RoutsBuilder setAddress(String address) {
            routs.setAddress(address);
            return this;
        }
        public RoutsBuilder setSum_routs(int sum_routs) {
            routs.setSum_routs(sum_routs);
            return this;
        }
        public Routs build() {
            return routs;
        }
    }
}
