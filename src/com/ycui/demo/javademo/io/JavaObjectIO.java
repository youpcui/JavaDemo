package com.ycui.demo.javademo.io;
import java.io.*;

public class JavaObjectIO {

	public static void main(String args[]) throws FileNotFoundException, IOException{
		Person p = new Person();
		p.setName("Adrien");
		p.setAge(30);
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object o = null;
		
		File f = new File("d://workspace//eclipse//JavaDemo//var//Person.obj");
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
		oos.writeObject(p);
		oos.close();
				
		ois = new ObjectInputStream(new FileInputStream(f));
		try {
			o = ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		if(o instanceof Person){
			Person newPerson = (Person) o;
			System.out.println(newPerson.getName());
			System.out.println(newPerson.getAge());
		}
	}
}



