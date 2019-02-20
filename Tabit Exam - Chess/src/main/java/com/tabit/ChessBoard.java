package com.tabit;

public class ChessBoard {

	/* 1. The functionality to initiate a Chessboard. */

	public ChessBoard() {

	}

	public ChessBoard(ChessBoard b) {

	}

	public static void main(String[] args) {
		
		// The name of the file to open.
		String fileName1 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-01.txt";
		String fileName2 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-02.txt";
		String fileName3 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-03.txt";
		String fileName4 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\chess-startup.txt";

		
		FileParser fp = new FileParser();
		fp.parse(fileName1);
		fp.parse(fileName2);
		fp.parse(fileName3);
		fp.parse(fileName4);
		
		
		String s1= "8 |oɹ|uʞ|ıq|nb|ıʞ|  |uʞ|oɹ|";
		String s2=null;
		String s3=null;
		String s4=null;
		String s5=null;
		String s6=null;
		String s7=null;
		String s8=null;
		String s9=null;
		
		
		
		WriteFile wf= new WriteFile();
		wf.write2chessfile(s1, s2, s3, s4, s5, s6, s7, s8, s9);
		
	}

}
