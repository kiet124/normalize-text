/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211normalize.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dotha
 */

public class TextNormalizer {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\dotha\\Documents\\NetBeansProjects\\lab211normalize text\\input.txt";
        String outputFilePath = "C:\\Users\\dotha\\Documents\\NetBeansProjects\\lab211normalize text\\output.txt";

        try {
            normalizeAndWrite(inputFilePath, outputFilePath);

            System.out.println("Normalization completed. Output written to 'output.txt'");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void normalizeAndWrite(String inputFilePath, String outputFilePath) throws IOException {
        // Read the input file
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        String line;
        boolean isStartOfDocument = true;

        while ((line = reader.readLine()) != null) {
            line = line.trim(); // Remove leading and trailing spaces

            if (line.isEmpty()) {
                // Skip empty lines
                continue;
            }

            String[] sentences = line.split("(?<=[.!?])\\s+");
            for (String sentence : sentences) {
                if (!isStartOfDocument) {
                    writer.write(" ");
                } else {
                    isStartOfDocument = false;
                }

                // Capitalize the first letter of the sentence
                sentence = capitalizeFirstLetter(sentence);

                writer.write(sentence);
            }
        }

        // Ensure there's a dot at the end of the text
        writer.write(".");
        writer.newLine();

        reader.close();
        writer.close();
    }

    private static String capitalizeFirstLetter(String sentence) {
        if (!sentence.isEmpty()) {
            char[] chars = sentence.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            return new String(chars);
        }
        return sentence;
    }
}





