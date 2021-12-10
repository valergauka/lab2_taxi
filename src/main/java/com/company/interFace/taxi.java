package com.company.interFace;

//import com.company.taxi;
import com.company.taxi.Taxi;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;

//import javax.xml.bind.JAXBException;


public interface taxi {
    void serialize(Taxi taxi, String path) throws JAXBException, IOException;
    Taxi deserialize(String path) throws JAXBException, FileNotFoundException;
}
