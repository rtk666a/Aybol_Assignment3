package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FIleService {

    public String[] loadData() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/DB.txt"));) {
            String line;
            String[] data = new String[4];
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                data[i++] = line;
            }
            return data;

        } catch (IOException exception) {
            System.out.println("there was exception IO file" + exception.getMessage());
        }
        return null;
    }
}
