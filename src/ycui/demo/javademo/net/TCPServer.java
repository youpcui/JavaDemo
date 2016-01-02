package ycui.demo.javademo.net;

import java.net.*;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(8888); // create port
			System.out.println("server is ready");
			client = server.accept(); // accept client
		} catch (IOException e) {
			System.err.println("Server is not etablished: "+e.getMessage());
		}
		try {
			out = new PrintWriter(client.getOutputStream());
			out.print("Hello"); 
		} catch (IOException e) {
			System.err.println("Massege can not be sent"+e.getMessage());
		}
		try {
			out.close();
			client.close();
			server.close();
		} catch (IOException e) {
			System.err.println("server is not closed"+e.getMessage());
		}
	}

}
