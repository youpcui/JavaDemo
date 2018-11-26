package ycui.demo.javademo.singleton;

public class ConcreteSingleton2 extends AbstractSingleton {
    private final int value;

    public ConcreteSingleton2(int value) throws SingletonException {
        super();
        // TODO Auto-generated constructor stub
        this.value = value;
    }
    
    public static ConcreteSingleton2 getInstance(int value){
        try {
            return AbstractSingleton.getInstance(ConcreteSingleton2.class, new Class<?>[]{int.class}, new Object[]{value});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } 
    }
    
    public int getValue(){
        return value;
    }

}