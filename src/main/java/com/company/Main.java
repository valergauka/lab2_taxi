package com.company;

import com.company.interFace.JSON;
import com.company.interFace.TXT;
import com.company.interFace.XML;
import com.company.taxi.Cars;
import com.company.taxi.Drivers;
import com.company.taxi.Routs;
import com.company.taxi.Taxi;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, JAXBException {
        Taxi taxi = new Taxi();
        Cars cars = new Cars();
        cars.setModel("Mercedes");
        cars.setColor("Red");
        cars.setNumberOfSeats(4);
        cars.setNumber("CE4671BT");

        Drivers drivers = new Drivers();
        drivers.setName("Lera");
        drivers.setExperience(2);
        drivers.setYear(20);

        taxi.getRouts().add(
                new Routs.RoutsBuilder()
                        .setCar(cars)
                        .setDriver(drivers)
                        .setAddress("Chernivtsi")
                        .setSum_routs(4000)
                        .build()
        );

        System.out.println(taxi.toString());
        try {
            new JSON().serialize(taxi, "taxi.json");
            new TXT().serialize(taxi, "taxi.txt");
            new XML().serialize(taxi, "taxi.xml");

            Taxi TaxiFromJSON = new JSON().deserialize("taxi.json");
            Taxi TAxiFromXML = new XML().deserialize("taxi.xml");

            System.out.println("\nXML:\n" + TAxiFromXML);
            System.out.println("\nJSON:\n" + TaxiFromJSON);
        } catch (JAXBException | IOException  e) {
            e.printStackTrace();
        }
    }
}
