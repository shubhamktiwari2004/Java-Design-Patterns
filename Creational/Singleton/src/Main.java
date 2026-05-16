import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}