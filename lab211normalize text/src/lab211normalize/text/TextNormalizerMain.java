/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class TextNormalizerMain {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\dotha\\Documents\\NetBeansProjects\\lab211normalize text\\input.txt";
        String outputFilePath = "C:\\Users\\dotha\\Documents\\NetBeansProjects\\lab211normalize text\\output.txt";

        TextNormalizer.normalizeAndWrite(inputFilePath, outputFilePath);
        
        System.out.println("Normalization completed. Output written to 'output.txt'");
    }
}