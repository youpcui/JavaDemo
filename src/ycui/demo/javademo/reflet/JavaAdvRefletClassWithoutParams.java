package ycui.demo.javademo.reflet;

import java.util.Iterator;
import java.util.List;

public class JavaAdvRefletClassWithoutParams {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		List<String> list = null;
		
		Class<?> c = Class.forName("java.util.ArrayList");
		
		list = (List<String>) c.newInstance();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
