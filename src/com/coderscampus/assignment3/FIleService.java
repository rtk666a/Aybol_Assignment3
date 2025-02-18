package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FIleService {

    public String[] loadData() {
        try {
            File file = new File("./src/DB.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] data = new String[4];
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                data[i++] = line;
            }

            return data;


        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
