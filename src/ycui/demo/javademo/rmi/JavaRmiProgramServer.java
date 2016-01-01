package ycui.demo.javademo.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class JavaRmiProgramServer {

	public static void main(String[] args) {
		try {
			JavaRmiPersonService ps = new JavaRmiPersonServiceImpl();
			LocateRegistry.createRegistry(6789);
			Naming.rebind("rmi://localhost:6789/JavaRmiPersonService", ps);
			System.out.println("Server is getting ready...");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
