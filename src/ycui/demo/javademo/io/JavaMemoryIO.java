package com.ycui.demo.javademo.io;
import java.io.*;

public class JavaMemoryIO {

	public static void main(String args[]) throws Exception
	{
		String str = "HELLO" ;
		// From upper case to lower case
		byte[] b = str.getBytes() ;
		ByteArrayInputStream in = new ByteArrayInputStream(b) ;
		ByteArrayOutputStream out = new ByteArrayOutputStream() ;

		// read byte by byte
		int c = 0 ;
		// if not end
		while((c=in.read())!=-1)
		{
			int ch = (int)Character.toLowerCase((char)c) ;
			// write in OutputStream
			out.write(ch) ;
		}

		b = out.toByteArray() ;
		System.out.println("Content: "+new String(b)) ;
	}

}
