package com.ycui.demo.javademo.rmi.fileinfo;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoadFileInterface extends Remote,Serializable{
	public void upLoadFile(FileInformation fileInof) throws RemoteException;
	public FileInformation downLoadFile(String filename) throws RemoteException ;
	}
