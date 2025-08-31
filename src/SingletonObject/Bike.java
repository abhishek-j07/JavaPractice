package SingletonObject;

public class Bike {

    private static Bike bike = new Bike();

    private String color;

    private Bike() {
    }

    public static Bike getInstance() {
        return bike;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
