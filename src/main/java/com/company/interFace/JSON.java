package com.company.interFace;

import com.company.taxi.TaxiServis;
import com.google.gson.*;

import javax.xml.bind.JAXBException;
import java.io.*;

public class JSON implements taxi{
    @Override
    public void serialize(TaxiServis taxi, String path) throws JAXBException, IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        fw.write(new GsonBuilder()
                .create()
                .toJson(taxi));
        fw.close();
    }

    @Override
    public TaxiServis deserialize(String path) throws JAXBException, FileNotFoundException {
        return new GsonBuilder()
                .create()
                .fromJson(new FileReader(path), TaxiServis.class);
    }

}
