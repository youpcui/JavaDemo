package ycui.demo.javademo.factory;

import java.io.*;
import java.util.*;

public class Test{

	public static void main(String[] args) {
		Fruit f = null;
		Properties p = new Properties();
/*		p.setProperty("a","ycui.demo.javademo.factory.Apple") ;
		p.setProperty("o","ycui.demo.javademo.factory.Orange") ;
		p.setProperty("b","ycui.demo.javademo.factory.Banana") ;
*/
		p = InitProperties.getProperties() ;
		System.out.println("Select a code :");
		System.out.println("a --> Apple | b --> Banana | o --> Orange");
		String code = new InputData().getString();
//		System.out.println(p.getProperty(code)) ; 
		f = FruitFactory.getFruitInstance(p.getProperty(code)) ;

		if(f!=null){
			f.grow() ;
			f.pick() ;
		}
		else{
			System.out.println("The code is not exist") ;
		}
	}
}

class InputData
{
	BufferedReader buf = null ;
	public InputData()
	{
		buf = new BufferedReader(new InputStreamReader(System.in)) ;
	}
	public String getString()
	{
		String str = null ;
		try
		{
			str = buf.readLine() ;
		}
		catch (Exception e)
		{
		}
		return str ;
	}
}
