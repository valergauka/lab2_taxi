package com.company.taxi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Taxi  {
    @XmlElement(name = "routs", type = Routs.class)
    private List<Routs> routs;
    public Taxi(){
        routs = new LinkedList<>();
    }
    public List<Routs> getRouts() {
        return routs;
    }
    public void setRouts(List<Routs> routs){
        this.routs = routs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return Objects.equals(routs, taxi.routs);
    }


    @Override
    public int hashCode() {
        return Objects.hash(routs);
    }


    @Override
    public String toString() {
        return "Taxi{" +
                "routs=" + routs +
                '}';
    }
}
