package ycui.demo.javademo.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class InitProperties {
	public static Properties getProperties(){
		Properties p = new Properties();
		try {
			p.loadFromXML(new FileInputStream("d://workspace//eclipse//JavaDemo//var//factory//fruit.properties"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}
}
