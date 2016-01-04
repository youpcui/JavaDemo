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
		
		//不允许有重复字段
		p.setProperty("name1", "Alex");
		p.setProperty("age1", "30");
		p.setProperty("name2", "Bernard");
		p.setProperty("age2", "15");
		
		try {
			p.storeToXML(new FileOutputStream("d://workspace//eclipse//JavaDemo//var//factory//pdemo.properties"), "properties demo");
		} catch (FileNotFoundException e) {
			System.err.println("未找到文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("输出错误");
			e.printStackTrace();
		}

		try {
			p.loadFromXML(new FileInputStream("d://workspace//eclipse//JavaDemo//var//factory//pdemo.properties"));
		} catch (InvalidPropertiesFormatException e) {
			System.err.println("格式异常");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("文件未找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("读取文件错误");
			e.printStackTrace();
		}
		
		System.out.println(p);
	}

}
