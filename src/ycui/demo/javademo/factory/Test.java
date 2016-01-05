package ycui.demo.javademo.factory;

public class Test{

	public static void main(String[] args) {
		Fruit f = null;
		try {
			f = (Fruit) FruitFactory.getFruitInstance("Apple");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(f!=null){
			f.grow();
			f.pick();
		}else{
			System.out.println("The fruit is not exist!") ;
		}
	}

}

