package com.ycui.demo.javademo.io;
import java.io.*;
import java.util.Date;

public class JavaObjectIO {

	public static void main(String args[]) throws FileNotFoundException, IOException{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object o1 = null;
		Object o2 = null;
		Object o3 = null;
		
		Person p1 = new Person();
		p1.setName("Adrien");
		p1.setAge(30);
		Person p2 = new Person();
		p2.setName("ÕÅÈý");
		p2.setAge(15);
		Date d = new Date();
		
		File f = new File("d://workspace//eclipse//JavaDemo//var//Person.obj");
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f)); // prepare to write into a file
		} catch (Exception e) {
			e.printStackTrace();
		}
		oos.writeObject(p1); // save objects
		oos.writeObject(p2);
		oos.writeObject(d);
		oos.close();
				
		ois = new ObjectInputStream(new FileInputStream(f)); // prepare to read from a file
		try {
			o1 = ois.readObject(); // read an object
			o2 = ois.readObject(); // read an object
			o3 = ois.readObject(); // read an object
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		if(o1 instanceof Person){ // verify the object is belong to class Person
			Person newPerson1 = (Person)o1;
			System.out.println(newPerson1.getName());
			System.out.println(newPerson1.getAge());
		}
		if(o2 instanceof Person){ // verify the object is belong to class Person
			Person newPerson2 = (Person)o2;
			System.out.println(newPerson2.getName());
			System.out.println(newPerson2.getAge());
		}
		if(o3 instanceof Date){ // verify the object is belong to class Person
			Date newDate = (Date)o3;
			System.out.println(newDate);
		}
	}
}



