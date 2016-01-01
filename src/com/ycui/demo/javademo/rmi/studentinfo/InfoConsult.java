package com.ycui.demo.javademo.rmi.studentinfo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InfoConsult extends Remote{
	public int getAge(String name) throws RemoteException;    
    public Student getStudent(String name) throws RemoteException;
}
