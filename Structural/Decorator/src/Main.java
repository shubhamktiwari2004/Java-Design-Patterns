import Decorator.Coffee;
import Decorator.MilkDecor;
import Decorator.SimpleCoffee;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println("Before");
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
        coffee = new MilkDecor(coffee);
        System.out.println("After adding milk");
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}