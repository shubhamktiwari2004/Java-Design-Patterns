package Observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {

    List<Observer> list = new ArrayList<>();
    @Override
    public void subscribe(Observer ob) {
        list.add(ob);

    }

    @Override
    public void unsubscribe(Observer ob) {
        list.remove(ob);

    }

    @Override
    public void notification() {
        for(Observer ob :list){
            ob.notification();
        }

    }
}
