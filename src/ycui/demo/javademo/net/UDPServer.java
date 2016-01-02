package ycui.demo.javademo.net;

import java.io.IOException;
import java.net.*;

public class UDPServer {

	public static void main(String[] args){
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] b =new byte[1024];
		int len = 0;
		while (true) {
			try {
				ds = new DatagramSocket(5000);
			} catch (SocketException e) {
				System.err.println("UDP服务器发送端口创建异常");
				e.printStackTrace();
			}
			System.out.println("请输入信息： ");
			try {
				len = System.in.read(b);
			} catch (IOException e) {
				System.err.println("读取数据异常");
				e.printStackTrace();
			}
			try {
				dp = new DatagramPacket(b, 0, len,InetAddress.getByName("localhost"), 8888);
			} catch (UnknownHostException e) {
				System.err.println("UDP服务器未知数据发送地址或端口");
				e.printStackTrace();
			}
			try {
				ds.send(dp);
			} catch (IOException e) {
				System.err.println("数据发送异常");
				e.printStackTrace();
			}
			ds.close();
		}
	}

}
