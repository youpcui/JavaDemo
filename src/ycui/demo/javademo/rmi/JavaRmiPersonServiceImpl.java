package ycui.demo.javademo.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

public class JavaRmiPersonServiceImpl extends UnicastRemoteObject implements JavaRmiPersonService{

	private static final long serialVersionUID = 301525963537906363L;

	protected JavaRmiPersonServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<Person> GetList() throws RemoteException {
		System.out.println("Get Person Start!");
		List<Person> personList=new LinkedList<Person>();

		Person person1=new Person();
		person1.setAge(25);
		person1.setName("Leslie");
		personList.add(person1);

		Person person2=new Person();
		person2.setAge(25);
		person2.setName("Rose");
		personList.add(person2);

		return personList;
	}

}
