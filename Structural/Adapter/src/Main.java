import Adapter.Adapter;
import Adapter.AndroidCharger;
import Adapter.AndroidChargerImpl;
import Adapter.AppleCharger;
import Adapter.Iphone;

public class Main {
    public static void main(String[] args) {

        AndroidCharger android = new AndroidChargerImpl();
        AppleCharger appleCharger = new Adapter(android);
        Iphone iphone = new Iphone(appleCharger);
        iphone.iphoneCharging();
    }
}