import Builder.Car;
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setName("BMW")
                .setPrice(20000000)
                .setEngine("V12")
                .build();
        car.display();

    }
}