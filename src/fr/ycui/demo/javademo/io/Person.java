package com.ycui.demo.javademo.io;
import java.io.Serializable;

class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7119163712882506552L;
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
