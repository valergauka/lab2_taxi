package com.company.interFace;

import com.company.taxi.TaxiServis;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class XML implements taxi{
    @Override
    public void serialize(TaxiServis taxi, String path) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(TaxiServis.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(taxi, new File(path));
    }

    @Override
    public TaxiServis deserialize(String path) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(TaxiServis.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        TaxiServis taxi = (TaxiServis) jaxbUnmarshaller.unmarshal(new File(path));
        return taxi;
    }
}
