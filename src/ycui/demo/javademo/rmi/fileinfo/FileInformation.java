package com.ycui.demo.javademo.rmi.fileinfo;

import java.io.Serializable;

public interface FileInformation extends Serializable{

	public String getName();
	public byte[] getContent();
	public void setInformation(String name, byte[] content);
}
