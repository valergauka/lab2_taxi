package com.company.interFace;

//import com.company.taxi;
import com.company.taxi.TaxiServis;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;

//import javax.xml.bind.JAXBException;


public interface taxi {
    void serialize(TaxiServis taxi, String path) throws JAXBException, IOException;
    TaxiServis deserialize(String path) throws JAXBException, FileNotFoundException;
}
