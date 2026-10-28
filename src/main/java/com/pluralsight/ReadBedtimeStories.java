package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBedtimeStories {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("goldilocks.txt");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }

            bufReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
