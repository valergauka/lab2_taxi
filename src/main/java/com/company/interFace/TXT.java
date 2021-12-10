package com.company.interFace;

import com.company.taxi.Taxi;

import java.io.*;

public class TXT {
    public void serialize(Taxi taxi, String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(taxi.toString());
        writer.close();
    }
}
