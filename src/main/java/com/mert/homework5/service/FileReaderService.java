package com.mert.homework5.service;

import com.mert.homework5.util.CommonData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    private static final String PATH = "src/main/resources";
    private static final String FILE = PATH + "/EncodingTable.txt";

    public void readFileToTemplate() {
        List<String> lineList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineList.add(line);
            }

        } catch (FileNotFoundException ex) {
            System.err.println(FILE + " --> " + ex.getMessage());
            System.exit(100);
        } catch (IOException ex) {
            System.err.println(FILE + " --> " + ex.getMessage());
            System.exit(100);
        }

        for (String line : lineList) {
            String[] entry = line.split("\t");
            CommonData.getInstance().getTemplate().put(entry[0].charAt(0),entry[1].charAt(0));
        }

    }
}