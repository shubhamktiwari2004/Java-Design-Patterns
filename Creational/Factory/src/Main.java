import Factory.Factory1;
import Factory.Shape;

public class Main {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Shape shape = factory1.getShape("Circle");
        shape.draw();
    }
}