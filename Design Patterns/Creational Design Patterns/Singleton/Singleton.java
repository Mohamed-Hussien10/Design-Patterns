public class Singleton{
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Hello, World!");
    }
    
    public static synchronized Singleton getInstance1() { 
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance2() { 
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

};