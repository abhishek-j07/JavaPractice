package SingletonObject;

public class BikeDemo {

    public static void main(String[] args) {

        Bike bike = Bike.getInstance();

        bike.setColor("red");
        //bike.setColor("green");

        System.out.println(bike.getColor());
    }
}
