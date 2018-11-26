package ycui.demo.javademo.singleton;

public class ConcreteSingleton1 extends AbstractSingleton {

    public ConcreteSingleton1() throws SingletonException {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static ConcreteSingleton1 getInstance(){
        try {
            return AbstractSingleton.getInstance(ConcreteSingleton1.class);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            // will not happen
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            // will not happen
            e.printStackTrace();
            return null;
        }
    }
}
