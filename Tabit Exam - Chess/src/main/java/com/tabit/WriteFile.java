package com.tabit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFile {

	public static void main(String[] args) {

		String fileName1 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-x.txt";

		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName1, "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.println("The third line");
			writer.println("The fourth line");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public void write2chessfile(String s1, String s2,String s3,String s4, String s5, String s6, String s7, String s8, String s9)
	{
		
		String fileName1 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-x.txt";

		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName1, "UTF-8");
			
			
			writer.println(s1);
			writer.println(s2);
			writer.println(s3);
			writer.println(s4);
			writer.println(s5);
			writer.println(s6);
			writer.println(s7);
			writer.println(s8);
			writer.println(s9);
			
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
