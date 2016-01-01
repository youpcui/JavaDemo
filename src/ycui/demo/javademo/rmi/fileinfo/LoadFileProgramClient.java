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
				System.err.println("错误的URL地址：未得到远程对象"+e.getMessage());
			} catch (RemoteException e) {
				System.err.println("远程通讯异常"+e.getMessage());
			} catch (NotBoundException e) {
				System.err.println("非边界异常"+e.getMessage());
			}	
			try {	
				FileInformation fileInfo = (FileInformation) loadFile.downLoadFile("rmi.txt");				
				System.out.println("文件名 --> "+fileInfo.getName());
				System.out.println("内容  --> "+new String(fileInfo.getContent(),0,fileInfo.getContent().length));
				
			} catch (RemoteException e) {
				System.err.println("远程通讯异常"+e.getMessage());
			} catch (Exception e){
				System.err.println("其他异常"+e.getMessage());
			}
//			fileInfo.getContent();
	}
}
