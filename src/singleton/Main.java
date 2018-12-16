package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstanceWithName("first");
        Singleton obj2 = Singleton.getInstanceWithName("second");


        System.out.println(obj.getName());
        System.out.println(obj2.getName());
    }
}
