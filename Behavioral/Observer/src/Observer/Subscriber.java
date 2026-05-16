package Observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name){
        this.name = name;
    }


    @Override
    public void notification() {
        System.out.println(name + " A new video is uploaded");
    }
}
