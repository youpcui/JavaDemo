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
				System.err.println("UDP���������Ͷ˿ڴ����쳣");
				e.printStackTrace();
			}
			System.out.println("��������Ϣ�� ");
			try {
				len = System.in.read(b);
			} catch (IOException e) {
				System.err.println("��ȡ�����쳣");
				e.printStackTrace();
			}
			try {
				dp = new DatagramPacket(b, 0, len,InetAddress.getByName("localhost"), 8888);
			} catch (UnknownHostException e) {
				System.err.println("UDP������δ֪���ݷ��͵�ַ��˿�");
				e.printStackTrace();
			}
			try {
				ds.send(dp);
			} catch (IOException e) {
				System.err.println("���ݷ����쳣");
				e.printStackTrace();
			}
			ds.close();
		}
	}

}
