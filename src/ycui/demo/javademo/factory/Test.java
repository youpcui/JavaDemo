package ycui.demo.javademo.factory;

public class Test {

	public static void main(String[] args) {
		Fruit f1 = new Apple();
		Fruit f2 = new Orange();
		f1.grow();
		f1.pick();
		f2.grow();
		f2.pick();
	}

}
