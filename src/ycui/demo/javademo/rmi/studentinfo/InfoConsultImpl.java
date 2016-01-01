package ycui.demo.javademo.rmi.studentinfo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class InfoConsultImpl extends UnicastRemoteObject implements InfoConsult{

	private static final long serialVersionUID = 1L;
	private List<Student> students; 
     protected InfoConsultImpl(List<Student> students) throws RemoteException { 
          super(); 
             
          this.students = students; 

     } 
     
	@Override
	public int getAge(String name) throws RemoteException {
		for(Student stu:students){ 
            if(stu.getName().equals(name)){ 
                   return stu.getAge(); 
            } 
    } 
    return -1; 
	}

	@Override
	public Student getStudent(String name) throws RemoteException {
		for(Student stu:students){ 
            if(stu.getName().equals(name)){ 
                 return stu; 
            } 
    } 
    return new Student("null",-1);
	}
}
