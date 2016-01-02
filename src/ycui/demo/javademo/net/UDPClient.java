package ycui.demo.javademo.net;
import java.net.*;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] b = new byte[1024];
		while(true){
			// 在8888端口等待信息
			ds = new DatagramSocket(8888);
			dp = new DatagramPacket(b, b.length);
			ds.receive(dp);
			String str = new String(dp.getData(), 0, dp.getLength());
			System.out.println(str);
			ds.close();
		}
	}
}
