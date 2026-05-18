package Decorator;

public class MilkDecor extends CoffeeDecor {

    public MilkDecor(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " + Added Milk";
    }

    @Override
    public int getCost() {
        return super.getCost()+20;
    }
}
