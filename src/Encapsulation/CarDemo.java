package Encapsulation;

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Maruti");
        car.setYearOfManufacture(2018);

        System.out.println(car.getName());
        System.out.println(car.getYearOfManufacture());
    }
}
