package com.company.interFace;

import com.company.taxi.Taxi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class XML implements taxi{
    @Override
    public void serialize(Taxi taxi, String path) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Taxi.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(taxi, new File(path));
    }

    @Override
    public Taxi deserialize(String path) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Taxi.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Taxi taxi = (Taxi) jaxbUnmarshaller.unmarshal(new File(path));
        return taxi;
    }
}
