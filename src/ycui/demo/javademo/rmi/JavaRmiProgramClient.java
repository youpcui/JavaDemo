package com.ycui.demo.javademo.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class JavaRmiProgramClient {

	public static void main(String[] args) {
		try {
			JavaRmiPersonService personService = (JavaRmiPersonService)Naming.lookup("rmi://localhost:6789/JavaRmiPersonService");
			List<Person> personList=personService.GetList();
			for(Person person:personList){
			System.out.println("Name: "+person.getName()+", Age: " +person.getAge());
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
