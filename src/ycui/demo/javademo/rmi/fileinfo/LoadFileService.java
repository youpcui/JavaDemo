package ycui.demo.javademo.rmi.fileinfo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoadFileService extends UnicastRemoteObject implements LoadFileInterface {
	private static final long serialVersionUID = 3521205543793110152L;
	private String currentDir = null;
	

	protected LoadFileService() throws RemoteException {
		super();
	}
	
	public String getCurrentDir() {
		return currentDir;
	}

	public void setCurrentDir(String currentDir) {
		this.currentDir = currentDir;
	}

	@Override
	public void upLoadFile(FileInformation fileInfo) throws RemoteException {
		BufferedOutputStream output = null ;
		
		// check parameter
		if(fileInfo == null){
			throw new RemoteException("参数为空！");
		}
		
		//check fileName and Content
		String fileName = fileInfo.getName();
		byte[] content = fileInfo.getContent();
		if(fileName==null || content==null){
			throw new RemoteException("文件或内容为空！");
		}
		
		//create file
		String filePath = this.currentDir + "//" + fileName ;
		File file = new File(filePath);
	
		try {
			//save the content to the file
			output = new BufferedOutputStream(new FileOutputStream(file));
			output.write(content);
			if(!file.exists()){
				file.createNewFile();
			} 
		}catch (IOException e) {
			System.err.println("上传写入文件异常" + e.getMessage());
		}finally{
			if(output!=null){
				try {
					output.close();
					output=null;
				} catch (IOException e) {
					System.err.println("上传文件输出流关闭异常" + e.getMessage());
				}			
			}
		}
	}

	@Override
	public FileInformation downLoadFile(String fileName) throws RemoteException {
		FileInformation fileInfo = null;
		BufferedInputStream input = null;
		
		try {
			//check parameter 
			if(fileName==null){
				throw new RemoteException("参数为空！");
			}
			
			//get path
			String filePath = this.getCurrentDir() + "//" + fileName;
			File file = new File(filePath);
			//check origin file
			if(!file.exists()){
//				System.out.println("<"+filePath+">");
				throw new RemoteException("文件：" + fileName + "不存在！");
			}
			
			//get content
			byte[] content = new byte[(int)file.length()];
			try {
				input = new BufferedInputStream(new FileInputStream(file));
			} catch (FileNotFoundException e) {
				System.err.println("下载文件未找到" + e.getMessage());
			}
			try {
				input.read(content);
			} catch (IOException e) {
				System.err.println("下载文件数据读取异常" + e.getMessage());
			}
			
			//set file name and content to fileInfo
			fileInfo = new FileInformationService();
			fileInfo.setInformation(fileName, content);
		}finally{
			if(input!=null){
				try {
					input.close();
					input=null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return (FileInformation)fileInfo;
	}

}
