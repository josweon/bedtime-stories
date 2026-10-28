package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadBedtimeStories {
    public static void main(String[] args) {
        try {
            String filePath = "src/main/resources/";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of a story: ");
            String story = filePath + scanner.nextLine().trim();

            FileReader fileReader = new FileReader(story);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            int lineNumber = 1;

            System.out.print("---\n");
            while ((input = bufReader.readLine()) != null) {
                System.out.printf("%d. %s%n",lineNumber, input);
                lineNumber++;
            }

            bufReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
