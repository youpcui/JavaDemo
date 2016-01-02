package ycui.demo.javademo.net;

import java.net.*;
import java.io.*;

public class TCPClient {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader buf = null;
		
		try {
			client = new Socket("localhost",8888); // create client 
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(buf.readLine());
		} catch (UnknownHostException e) {
			System.err.println("TCP客户端未知地址或端口");
			e.printStackTrace();
		}catch (IOException e){
			System.err.println("数据读取异常");
			e.printStackTrace();
		}	
		try {
			client.close();  // close client
		} catch (IOException e) {
			System.err.println("TCP客户端关闭异常");
			e.printStackTrace();
		}

	}
}
