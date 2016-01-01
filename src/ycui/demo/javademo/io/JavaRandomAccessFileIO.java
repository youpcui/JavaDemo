package ycui.demo.javademo.io;

import java.io.RandomAccessFile;

public class JavaRandomAccessFileIO {

	public static void main(String args[]) throws Exception
	{
		RandomAccessFile raf1 = new RandomAccessFile("d://workspace//eclipse//JavaDemo//var//io.txt","rw") ;
		// 随机读取有一个限制，就是说如果要进行操作，则必须指定好数据的存储长度
		// 保存姓名（8位字符串）和年龄（int 4）：
		String name = "Pierre  " ;
		int age = 20 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;
		

		name = "Leo     " ;
		age = 30 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;

		name = "Tito    " ;
		age = 33 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;

		raf1.close() ;

		RandomAccessFile raf2 = new RandomAccessFile("d://workspace//eclipse//JavaDemo//var//io.txt","r") ;
		// 读取第二个人的数据
		raf2.skipBytes(12) ;
		byte b[] = new byte[8] ;
		raf2.read(b) ;
		int age2 = raf2.readInt() ;
		raf2.close();
		System.out.println(new String(b)+" --> "+age2) ;

	}

}
