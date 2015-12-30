package com.ycui.demo.javademo.io;

import java.io.*;

class Receiver implements Runnable{
	private PipedInputStream in;
	private String name;
	
	public Receiver(String name){
		this.name = name;
		this.in = new PipedInputStream();
	} 
	public String getName(){
		return this.name;
	}
	public PipedInputStream getIn(){
		return this.in;
	}

	@Override
	public void run() {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = in.read(b);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("received--> " + new String(b,0,len) );		 
	}
}
