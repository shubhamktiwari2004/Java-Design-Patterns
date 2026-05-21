package Proxy;

public class RealImage implements Image{
    private String file;


    public RealImage(String file) {
        this.file=file;
        loadFromDisk(file);
    }

    private void loadFromDisk(String file) {
        System.out.println("loading "+file);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+file);
    }
}
