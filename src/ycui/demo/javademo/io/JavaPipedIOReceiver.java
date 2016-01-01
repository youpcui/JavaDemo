package com.ycui.demo.javademo.io;

import java.io.*;

class JavaPipedIOReceiver implements Runnable{
	private PipedInputStream in;
	private String name;
	
	public JavaPipedIOReceiver(String name){
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
/*		
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = in.read(b);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/	
		ByteArrayOutputStream out = new ByteArrayOutputStream() ;
		byte[] b; //define an array
		int tmp = 0;
		try {
			while((tmp=in.read())!=-1){ // Loop through the input stream until its end
				out.write(tmp); // write every byte
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		b = out.toByteArray();
		try {
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			saveData(b); // save file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("received--> " + new String(b) );		 
	}
	
	private void saveData(byte[] b) throws FileNotFoundException, IOException{
		File f = new File("D://workspace//eclipse//JavaDemo//var//obj//received.obj");
		FileOutputStream fo = new FileOutputStream(f);
		if(f.exists()){
			f.delete();
		}else{
			f.createNewFile();		
		}
		fo.write(b);
		fo.close();
	}

}
