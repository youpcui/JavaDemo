package ycui.demo.javademo.colletion;

import java.util.*;

class Student{
	private String name;
	private List<Cours> allCours;
	
	public Student(){
		this.allCours = new ArrayList<Cours>();
	}
	public Student(String name){
		this();
		this.setName(name);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public List<Cours> getAllCours(){
		return this.allCours;
	}
	public void setAllCours(List<Cours> allCours){
		this.allCours = allCours;
	}
		public String toString(){
		return this.getName();
	}
}


class Cours{
	private String name;
	private List<Student> allStudents;
	
	public Cours(){
		this.allStudents = new ArrayList<Student>();
	}
	public Cours(String name){
		this();
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public List<Student> getAllStudent(){
		return this.allStudents;
	}
	public void setAllStudents(List<Student> allStudents){
		this.allStudents = allStudents;
	}

	public String toString(){
		return this.getName();
	}
	
}

public class MultiMulti {

	public static void main(String[] args) {
		//create Students
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		Student s3 = new Student("王五");
		Student s4 = new Student("赵六");
		
		//create Cours
		Cours c1 = new Cours("Java");
		Cours c2 = new Cours("Python");
		Cours c3 = new Cours("C++");

		//s1 select cours
		s1.getAllCours().add(c1);
		s1.getAllCours().add(c2);
		s1.getAllCours().add(c3);
		
		//s2 select cours
		s2.getAllCours().add(c1);
		s2.getAllCours().add(c2);
		
		//s3 select cours
		s3.getAllCours().add(c1);
		s3.getAllCours().add(c3);
		
		//s4 select cours
		s4.getAllCours().add(c3);
		
		//c1 is selected
		c1.getAllStudent().add(s1);
		c1.getAllStudent().add(s2);
		c1.getAllStudent().add(s3);
		
		//c2 is selected
		c2.getAllStudent().add(s1);
		c2.getAllStudent().add(s2);
		
		//c3 is selected
		c3.getAllStudent().add(s1);
		c3.getAllStudent().add(s3);
		c3.getAllStudent().add(s4);
		
		print(s1);
		print(s2);
		print(s3);
		print(s4);
		System.out.println("--------------------------");
		print(c1);
		print(c2);
		print(c3);
		
	}
	
	public static void print(Student s){
		System.out.println("Student: "+s+" selected:");
		Iterator<Cours> iter = s.getAllCours().iterator();
		while(iter.hasNext()){
			System.out.println("  |-"+iter.next());
		}
	}

	public static void print(Cours c){
		System.out.println("Cours: "+c+" is selected by:");
		Iterator<Student> iter = c.getAllStudent().iterator();
		while(iter.hasNext()){
			System.out.println("  |-"+iter.next());
		}
	}
}
