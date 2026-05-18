package Decorator;

abstract class CoffeeDecor implements Coffee {
    protected Coffee coffeeDecor;

    public CoffeeDecor(Coffee coffeeDecor) {
        this.coffeeDecor = coffeeDecor;
    }

    @Override
    public String getDescription() {
        return coffeeDecor.getDescription();
    }

    @Override
    public int getCost() {
        return coffeeDecor.getCost();
    }
}
