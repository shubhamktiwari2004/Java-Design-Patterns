package Factory;

public class Factory1 {

    public Shape getShape(String type){
        if(type.equals("Circle")) return new Circle();
        else if (type.equals("Square")) return new Square();
        else return null;
    }
}
