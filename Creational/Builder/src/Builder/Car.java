package Builder;

public class Car {
    private String name;
    private int price;
    private String engine;

    public static class Builder{
        private String name;
        private int price;
        private String engine;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setPrice(int price){
            this.price = price;
            return this;
        }
        public Builder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.name = this.name;
            car.engine = this.engine;
            car.price = this.price;
            return car;
        }

    }
    public void display(){
        System.out.println(name +" "+ engine+" "+ price);
    }
}
