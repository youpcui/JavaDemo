package ycui.demo.javademo.singleton;

import ycui.demo.javademo.singleton.AbstractSingleton.SingletonException;

public class TestSingleton {

	public static void main(String[] args) {
		     // TODO Auto-generated method stub
		     ConcreteSingleton1 singleton1 = null;
		     ConcreteSingleton2 singleton2 = null;
		    
		    // 第一次创建实例，创建成功
		    try {
		   singleton1 = new ConcreteSingleton1();
		   System.out.println(singleton1);
		    } catch (SingletonException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		    }
		    /*
		    try {
		   singleton2 = new ConcreteSingleton2(5);
		   System.out.println(singleton2 + "---" + singleton2.getValue());
		    } catch (SingletonException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		    }
		    */
		    
		   // 获取单例实例，与前面new出来的实例是同一个实例
		    singleton1 = ConcreteSingleton1.getInstance();
		    System.out.println(singleton1);
		    
		    singleton2 = ConcreteSingleton2.getInstance(6);
		    System.out.println(singleton2 + "---" + singleton2.getValue());
		    
		    // 试图创建第二个实例，抛出异常，创建失败
		    try {
		   singleton1 = new ConcreteSingleton1();
		   System.out.println(singleton1);
		    } catch (SingletonException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		    }
		    
		    try {
		   singleton2 = new ConcreteSingleton2(5);
		   System.out.println(singleton2 + "---" + singleton2.getValue());
		    } catch (SingletonException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		    }
	}
}
