package com.ycui.demo.javademo.io;
import java.io.*;

public class JavaPipedIO {

	public static void main(String[] args) throws IOException {
		File file = new File("d://workspace//eclipse//JavaDemo//var//io.txt");
		Sender sd = new Sender("Sender1",file);
		Receiver rd = new Receiver("Receiver1");
		
		PipedOutputStream out = sd.getOut();	
		PipedInputStream in = rd.getIn();
				
		Thread send = new Thread(sd,sd.getName());
		Thread receive = new Thread(rd,rd.getName());
			
		out.connect(in);	
		send.start();
		receive.start();
	}
}
