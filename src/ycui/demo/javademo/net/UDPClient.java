package ycui.demo.javademo.net;
import java.io.IOException;
import java.net.*;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] b = new byte[1024];
		while(true){
			// 在8888端口等待信息
			try {
				ds = new DatagramSocket(8888);
			} catch (SocketException e) {
				System.err.println("创建UDP客户端端口异常"+e.getMessage());
			}
			dp = new DatagramPacket(b, b.length);
			try {
				ds.receive(dp);
			} catch (IOException e) {
				System.err.println("UDP客户端接收数据异常"+e.getMessage());
			}
			String str = new String(dp.getData(), 0, dp.getLength());
			System.out.println(str);
			ds.close();
		}
	}
}
