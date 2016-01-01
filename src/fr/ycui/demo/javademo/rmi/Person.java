package com.ycui.demo.javademo.rmi;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 6816457832386985964L;

	private String name;
	private int age;
	
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
}
