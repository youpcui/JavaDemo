import java.util.ArrayList;
import java.util.List;


public class Hat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person{
	private String name;
	private String hatColor;
	
	public Person(String name, String color){
		this.setName(name);
		this.setHatColor(color);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setHatColor(String color){
		this.hatColor = color;
	}
	public String getHatColor(){
		return this.hatColor;
	}
}

class Queue{
	private List queue;
	public Queue(){
		queue = new ArrayList<Person>();
	}
	
}
