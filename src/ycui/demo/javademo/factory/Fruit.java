package ycui.demo.javademo.factory;


public interface Fruit {

	public void grow();

	public void pick();
}

abstract class InFarm implements Fruit {
	protected String fruitName = "Fruit";

	public InFarm(String fruitName) {
		this.fruitName = fruitName;
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

	public Apple() {
		super("Apple");
	}

	@Override
	public void grow() {
		super.grow();
	}

	@Override
	public void pick() {
		super.pick();
	}
}

class Orange extends InFarm {

	public Orange() {
		super("Orange");
	}

	@Override
	public void grow() {
		super.grow();
	}

	@Override
	public void pick() {
		super.pick();
	}
}