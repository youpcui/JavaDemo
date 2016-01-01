package com.ycui.demo.javademo.rmi.studentinfo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class SchoolClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InfoConsult consult = null;
		try {
			consult = (InfoConsult) Naming
					.lookup("rmi://localhost:6788/InfoConsult");
			System.out.println(consult.getStudent("baby").getAge());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(consult.getStudent("guo"));
		} catch (RemoteException e) {
			System.out.println("远程连接异常"+e.getMessage());
		}

	}

}
