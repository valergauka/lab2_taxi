package com.company.interFace;

import com.company.taxi.TaxiServis;

import java.io.*;

public class TXT {
    public void serialize(TaxiServis taxi, String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(taxi.toString());
        writer.close();
    }
}
