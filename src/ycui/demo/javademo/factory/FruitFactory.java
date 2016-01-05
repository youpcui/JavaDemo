package ycui.demo.javademo.factory;

public class FruitFactory {
	public static Fruit getFruitInstance(String type){
		Fruit f = null;
		
		try {
			f = (Fruit) Class.forName(type).newInstance();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			if(f==null){
				f = new DefaultFruit();
			}
		}
		
		return f;
	
		
	}
}
