import Proxy.Image;
import Proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("Resume");
        image.display();
    }
}