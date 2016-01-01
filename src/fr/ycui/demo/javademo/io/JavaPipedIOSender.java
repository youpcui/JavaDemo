package com.ycui.demo.javademo.io;

import java.io.*;

class JavaPipedIOSender implements Runnable{
	private PipedOutputStream out;

	private File file;
	private String name;

	
	public JavaPipedIOSender (String name, File file){
		this.name = name;
		this.file = file;
		this.out = new PipedOutputStream();
	}
	
	public String getName(){
		return this.name;
	}
	
	public File getFile(){
		return this.file;
	}
	
	public PipedOutputStream getOut() {
		return this.out;
	}
	
	
	
	public void run(){
		byte[] data = null;
		try {
			data = this.forwardData(getFile());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		 
		try {
			out.write(data);
			out.close();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		System.out.println("sent--> " + this.getFile().getPath());
	}
	
	private byte[] forwardData(File f) throws Exception{
		InputStream in = new FileInputStream(f);
		ByteArrayOutputStream out = new ByteArrayOutputStream() ;
		byte[] b; //define an array
		int tmp = 0;
		while((tmp=in.read())!=-1){ // Loop through the input stream until its end
			out.write(tmp); // write every byte
		}
		b = out.toByteArray();
		in.close();
		out.close();
		
		return b;	
	}
}
