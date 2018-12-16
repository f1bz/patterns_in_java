package singleton;

public class Singleton {
    volatile private static Singleton obj;
//    private static Singleton obj; // lazy-initialization

    private String name;

    private Singleton() {

    }


    public static Singleton getInstanceWithName(String name) {

        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                    obj.name = name;
                }
            }
        }

        return obj;
    }

    public String getName() {
        return name;
    }
}
