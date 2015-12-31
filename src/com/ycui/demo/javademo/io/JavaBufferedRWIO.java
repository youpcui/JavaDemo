package com.ycui.demo.javademo.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class JavaBufferedRWIO{

	public static void main(String[] args) {
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Input: ");
			str = br.readLine(); // read String
			br.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(str);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);

	}
}
