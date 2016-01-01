package ycui.demo.javademo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface JavaRmiPersonService extends Remote{

	public List<Person> GetList() throws RemoteException;
}
