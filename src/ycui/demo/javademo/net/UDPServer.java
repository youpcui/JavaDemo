package ycui.demo.javademo.net;

import java.net.*;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] b =new byte[1024];
		int len = 0;
		while (true) {
			ds = new DatagramSocket(5000);
			System.out.println("«Î ‰»Î–≈œ¢£∫ ");
//			String str = "";
//			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//			str = buf.readLine();
//			dp = new DatagramPacket(str.getBytes(), 0, str.length(),InetAddress.getByName("localhost"), 8888);
			len = System.in.read(b);
			dp = new DatagramPacket(b, 0, len,InetAddress.getByName("localhost"), 8888);
			ds.send(dp);
			ds.close();
		}
	}

}
