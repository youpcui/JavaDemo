package ycui.demo.javademo.oo;

interface A{
	public static final String  AA = "AA";
	public String sayA();
}

interface B{
	public static final String BB = "BB";
	public void sayB();
}

abstract class X implements A,B{
	public String sayA(){
		return AA;
	}
	public abstract void sayB();
}

class Y extends X{
	public void sayB(){
		System.out.println(BB);
	}
	public String sayA(){
		return "YAA";
	}
}

class Factory{
	public static X getXInstance(){
		return new Y();
		
	}
	
} 
public class JavaOO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		A a = Factory.getXInstance();
		System.out.println(a.sayA());
		B b = Factory.getXInstance();
		b.sayB();

	}

}
