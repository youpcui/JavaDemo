package com.ycui.demo.javademo.io;

import java.io.RandomAccessFile;

public class JavaRandomAccessFileIO {

	public static void main(String args[]) throws Exception
	{
		RandomAccessFile raf1 = new RandomAccessFile("f:\\mldn.txt","rw") ;
		// �����ȡ��һ�����ƣ�����˵���Ҫ���в����������ָ�������ݵĴ洢����
		// ����������8λ�ַ����������䣨int 4����
		String name = "zhangsan" ;
		int age = 20 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;
		

		name = "lisi    " ;
		age = 30 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;

		name = "wangwu   " ;
		age = 33 ;
		raf1.write(name.getBytes()) ;
		raf1.writeInt(age) ;

		raf1.close() ;

		RandomAccessFile raf2 = new RandomAccessFile("f:\\mldn.txt","r") ;
		// ��ȡ�ڶ����˵�����
		raf2.skipBytes(12) ;
		byte b[] = new byte[8] ;
		raf2.read(b) ;
		int age2 = raf2.readInt() ;
		raf2.close();
		System.out.println(new String(b)+" --> "+age2) ;

	}

}
