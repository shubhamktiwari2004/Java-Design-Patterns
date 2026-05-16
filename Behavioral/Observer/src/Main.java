import Observer.Subscriber;
import Observer.Youtube;

public class Main {
    public static void main(String[] args) {

        Subscriber aman = new Subscriber("Aman");
        Subscriber rahul = new Subscriber("Rahul");

        Youtube yt = new Youtube();
        yt.subscribe(aman);
        yt.subscribe(rahul);
        yt.notification();

    }
}