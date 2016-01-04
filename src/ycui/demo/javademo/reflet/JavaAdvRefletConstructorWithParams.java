package ycui.demo.javademo.reflet;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Person{
	private String name;
	private int age;
	public Person(){
		
	}
	public Person(String name, int age){
		this();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "My name is: "+this.getName();
	}
}
public class JavaAdvRefletConstructorWithParams {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Person p = null;
		Class<Person> c = null;
		Constructor<?> cos = null;
/*		
		try {
			c = (Class<Person>) Class.forName("ycui.demo.javademo.reflet.Person");
			p = c.newInstance(); // call constractor no parameter
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
*/
		
		try {
			
			c = (Class<Person>) Class.forName("ycui.demo.javademo.reflet.Person"); // find class "Person"
			Object[] obj= {"Alex",30}; // array of parameter
			cos = c.getConstructors()[1]; // return constructor 1 of class "Person"
			p = (Person) cos.newInstance(obj); //return object of "Person" with Constructor parameters
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println("cos返回Person对象");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.err.println("cos返回Person对象");
			e.printStackTrace();
		}
		
		System.out.println(p);
	}

}
