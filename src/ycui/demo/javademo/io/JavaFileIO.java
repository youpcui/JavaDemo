package com.ycui.demo.javademo.io;

import java.io.*;

public class JavaFileIO {

	public static void main(String[] args) throws Exception {
		
		File f = new File("d://workspace//eclipse//JavaDemo//var//io.txt");
		Writer out = new FileWriter(f);
		FileReader in = new FileReader(f);
		
		String str = "Hello World!";
		out.write(str);
		out.close();
		
		char[] c = new char[500];
		int len = in.read(c);
		in.close();
		System.out.println(new String(c,0,len));


	}
	
}
