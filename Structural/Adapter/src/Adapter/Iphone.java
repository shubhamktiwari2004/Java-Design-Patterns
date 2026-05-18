package Adapter;

public class Iphone implements AppleCharger{
    private AppleCharger charger;

    public Iphone(AppleCharger charger) {
        this.charger = charger;
    }

    @Override
    public void iphoneCharging() {
        charger.iphoneCharging();
    }
}
