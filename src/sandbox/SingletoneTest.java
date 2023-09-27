package sandbox;

public class SingletoneTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instanceOf();
        Singleton singleton1 = Singleton.instanceOf();
        Singleton singleton2 = Singleton.instanceOf();

        System.out.println(singleton.equals(singleton1));
        System.out.println(singleton1 == singleton2);
        if (singleton == singleton1 && singleton == singleton2){
            System.out.println("These is singleton");
        }
    }
}

class Singleton {
    private static Singleton instance_singleton = null;

    private Singleton() {

    }

    public static Singleton instanceOf() {
        if (instance_singleton == null){
            instance_singleton = new Singleton();
        }

        return instance_singleton;
    }

}