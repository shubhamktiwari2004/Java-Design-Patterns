package Adapter;

public class Adapter implements AppleCharger {
    private AndroidCharger charger;

    public Adapter(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void iphoneCharging() {
        charger.androidCharging();
    }
}
