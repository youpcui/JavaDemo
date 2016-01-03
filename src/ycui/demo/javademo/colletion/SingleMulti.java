package ycui.demo.javademo.colletion;

import java.util.*;

class Person{
	private String name;
	private List<Email> allEmails;
	
	public Person(){
		this.allEmails = new ArrayList<Email>();
	}
	public Person(String name){
		this();
		this.setName(name);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public List<Email> getAllEmails(){
		return this.allEmails;
	}
	public void setAllEmails(List<Email> allEmails){
		this.allEmails = allEmails;
	}
		public String toString(){
		return "Name: "+ this.getName();
	}
}


class Email{
	private String userName;
	private String domain;
	private final String at = "@";
	
	public Email(String userName, String domain){
		this.userName = userName;
		this.domain = domain;
	}
	public String getUserName(){
		return this.userName;
	}
	public String getDomain(){
		return this.domain;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public void setDomain(String domain){
		this.domain = domain;
	}
	public String toString(){
		return "Email: "+this.getUserName()+at+this.getDomain();
	}
	
}

public class SingleMulti {

	public static void main(String[] args) {
		Person p = new Person("Franc");
		Email e1 = new Email("work","gmail.com");
		Email e2 = new Email("particular","hotmail.com");
		Email e3 = new Email("gfrank","live.com");
		
		p.getAllEmails().add(e1);
		p.getAllEmails().add(e2);
		p.getAllEmails().add(e3);
		
		List<Email> list = p.getAllEmails();
		Iterator<Email> iter = list.iterator();
		System.out.println(p);
		while(iter.hasNext()){
			Email e = (Email)iter.next();
			System.out.println("  |-"+e);
		}
	}

}
