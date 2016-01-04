package ycui.demo.javademo.factory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;


public class JavaPropertiesDemo {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		//���������ظ��ֶ�
		p.setProperty("name1", "Alex");
		p.setProperty("age1", "30");
		p.setProperty("name2", "Bernard");
		p.setProperty("age2", "15");
		
		try {
			p.storeToXML(new FileOutputStream("d://workspace//eclipse//JavaDemo//var//factory//pdemo.properties"), "properties demo");
		} catch (FileNotFoundException e) {
			System.err.println("δ�ҵ��ļ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("�������");
			e.printStackTrace();
		}

		try {
			p.loadFromXML(new FileInputStream("d://workspace//eclipse//JavaDemo//var//factory//pdemo.properties"));
		} catch (InvalidPropertiesFormatException e) {
			System.err.println("��ʽ�쳣");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("�ļ�δ�ҵ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("��ȡ�ļ�����");
			e.printStackTrace();
		}
		
		System.out.println(p);
	}

}
