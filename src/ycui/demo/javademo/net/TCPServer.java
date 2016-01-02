package ycui.demo.javademo.net;

import java.net.*;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(8888);
			System.out.println("server is ready");
			client = server.accept();
		} catch (IOException e) {
			System.err.println("Server is not etablished: "+e.getMessage());
		}
		
		try {
			out = new PrintWriter(client.getOutputStream());
			out.print("Hello");
			out.close();
		} catch (IOException e) {
			System.err.println("Massege can not output"+e.getMessage());
		}

		try {
			client.close();
			server.close();
		} catch (IOException e) {
			System.err.println("server is not closed"+e.getMessage());
		}
	}

}
