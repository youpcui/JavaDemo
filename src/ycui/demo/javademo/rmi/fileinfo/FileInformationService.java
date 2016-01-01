package ycui.demo.javademo.rmi.fileinfo;

import java.rmi.RemoteException;

public class FileInformationService implements FileInformation{
	private static final long serialVersionUID = 6730219155206948828L;
	
	private String name = null;
	private byte[] content = null;

	protected FileInformationService() throws RemoteException {
		super();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public byte[] getContent() {
		return this.content;
	}

	@Override
	public void setInformation(String name, byte[] content) {	
		this.name = name;
		this.content = content;
	}	
}
