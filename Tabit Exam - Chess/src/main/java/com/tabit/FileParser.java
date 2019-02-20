package com.tabit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

	public static void main(String[] args) {

		// The name of the file to open.
		String fileName1 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-01.txt";
		String fileName2 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-02.txt";
		String fileName3 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-03.txt";
		String fileName4 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-startup.txt";

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName1);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName1 + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName1 + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

		System.out.println("**************************************************************");

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName2);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName2 + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName2 + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

		System.out.println("**************************************************************");

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName3);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName3 + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName3 + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

		System.out.println("**************************************************************");

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName4);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName4 + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName4 + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}

	public String parse(String str) {

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(str);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
			
			
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + str + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + str + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

		System.out.println("**************************************************************");
		return line;

	}

}
