package ycui.demo.javademo.rmi.fileinfo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LoadFileProgramClient {

	public static void main(String[] args) {
			LoadFileInterface loadFile = null;
			try {
				loadFile = (LoadFileInterface) Naming.lookup("rmi://localhost:6789/LoadFile");
			} catch (MalformedURLException e) {
				System.err.println("�����URL��ַ��δ�õ�Զ�̶���"+e.getMessage());
			} catch (RemoteException e) {
				System.err.println("Զ��ͨѶ�쳣"+e.getMessage());
			} catch (NotBoundException e) {
				System.err.println("�Ǳ߽��쳣"+e.getMessage());
			}	
			try {	
				FileInformation fileInfo = (FileInformation) loadFile.downLoadFile("rmi.txt");				
				System.out.println("�ļ��� --> "+fileInfo.getName());
				System.out.println("����  --> "+new String(fileInfo.getContent(),0,fileInfo.getContent().length));
				
			} catch (RemoteException e) {
				System.err.println("Զ��ͨѶ�쳣"+e.getMessage());
			} catch (Exception e){
				System.err.println("�����쳣"+e.getMessage());
			}
//			fileInfo.getContent();
	}
}
