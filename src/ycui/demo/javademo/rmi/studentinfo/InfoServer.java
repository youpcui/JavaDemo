package ycui.demo.javademo.rmi.studentinfo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

public class InfoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MalformedURLException, NamingException { 
		 
		InfoServer server = new InfoServer(); 
		InfoConsult consult = null;
		try {
			consult = new InfoConsultImpl(server.getMockData());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//consult= (InfoConsult)UnicastRemoteObject.exportObject(consult, 0); 
		try {
			//使用程序创建RIM注册服务 
			LocateRegistry.createRegistry(6788);
			Naming.rebind("rmi://localhost:6788/InfoConsult", consult);
			System.out.println("Server is getting ready...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 
}
	public List<Student> getMockData() {
		List<Student> lst = new ArrayList<Student>();
		lst.add(new Student("guo", 26));
		lst.add(new Student("zhang", 24));
		lst.add(new Student("baby", 1));
		return lst;

	}

}
