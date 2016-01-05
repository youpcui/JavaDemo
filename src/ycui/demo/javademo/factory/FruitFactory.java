package ycui.demo.javademo.factory;

public class FruitFactory {
	public static Fruit getFruitInstance(String type){
		Fruit f = null;
		
		try {
			f = (Fruit) Class.forName(type).newInstance();
		} catch (Exception e){
			e.printStackTrace();
		}
		return f;
	
		
	}
}
