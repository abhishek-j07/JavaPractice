package Interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone.modelName());

        //accessing static method
        Phone.print();

        // accessing default method
        smartPhone.add();
    }
}
