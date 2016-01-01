package ycui.demo.javademo.rmi.fileinfo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class LoadFileProgramServer {

	public static void main(String[] args) {
		try {
			//load security manager
//			System.setSecurityManager(new RMISecurityManager());
			
			//create a service object
			LoadFileService server = new LoadFileService();
			server.setCurrentDir("D://workspace//eclipse//JavaDemo//var//rmi");
			
			//registry RMI server
			LocateRegistry.createRegistry(6789);
			Naming.rebind("rmi://localhost:6789/LoadFile", server);
			System.out.println("Server is getting ready...");
		} catch (RemoteException e) {
			System.err.println("远程通讯异常"+e.getMessage());
		} catch (MalformedURLException e) {
			System.err.println("远程URL格式异常"+e.getMessage());
		}
		
	}

}
