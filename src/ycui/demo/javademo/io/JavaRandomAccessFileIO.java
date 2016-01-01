package ycui.demo.javademo.io;

import java.io.RandomAccessFile;

public class JavaRandomAccessFileIO {

	public static void main(String args[]) throws Exception
	{
		RandomAccessFile raf1 = new RandomAccessFile("d://workspace//eclipse//JavaDemo//var//io.txt","rw") ;
		// �����ȡ��һ�����ƣ�����˵���Ҫ���в����������ָ�������ݵĴ洢����
		// ����������8λ�ַ����������䣨int 4����
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
		// ��ȡ�ڶ����˵�����
		raf2.skipBytes(12) ;
		byte b[] = new byte[8] ;
		raf2.read(b) ;
		int age2 = raf2.readInt() ;
		raf2.close();
		System.out.println(new String(b)+" --> "+age2) ;

	}

}
