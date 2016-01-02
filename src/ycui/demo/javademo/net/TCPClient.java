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
			System.err.println("TCP�ͻ���δ֪��ַ��˿�");
			e.printStackTrace();
		}catch (IOException e){
			System.err.println("���ݶ�ȡ�쳣");
			e.printStackTrace();
		}	
		try {
			client.close();  // close client
		} catch (IOException e) {
			System.err.println("TCP�ͻ��˹ر��쳣");
			e.printStackTrace();
		}

	}
}
