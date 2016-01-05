package ycui.demo.javademo.factory;


public interface Fruit {

	public void grow();

	public void pick();
}

abstract class InFarm implements Fruit {
	private String fruitName;
	
	protected InFarm(String name){
		this.fruitName = name;
	}
	
	@Override
	public void grow() {
		System.out.println(this.fruitName + " is growing...");
	}

	@Override
	public void pick() {
		System.out.println(this.fruitName + " is picked...");
	}

}

class Apple extends InFarm {
	private static final String NAME = "Apple";

	public Apple(){
		super(NAME);
	}
}

class Orange extends InFarm {

	private static final String NAME = "Orange";

	public Orange(){
		super(NAME);
	}
}

class Banana extends InFarm {

	private static final String NAME = "Banana";
	
	public Banana() {
		super(NAME);
	}
}
