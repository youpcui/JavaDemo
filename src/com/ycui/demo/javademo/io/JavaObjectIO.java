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
			oos = new ObjectOutputStream(new FileOutputStream(f)); // prepare to write into a file
		} catch (Exception e) {
			e.printStackTrace();
		}
		oos.writeObject(p); // save an object
		oos.close();
				
		ois = new ObjectInputStream(new FileInputStream(f)); // prepare to read from a file
		try {
			o = ois.readObject(); // read an object
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		if(o instanceof Person){ // verify the object is belong to class Person
			Person newPerson = (Person) o;
			System.out.println(newPerson.getName());
			System.out.println(newPerson.getAge());
		}
	}
}



