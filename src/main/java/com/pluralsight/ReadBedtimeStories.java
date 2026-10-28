package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadBedtimeStories {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of a story: ");
            String story = scanner.nextLine();

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
