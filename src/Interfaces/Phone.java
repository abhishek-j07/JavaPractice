package Interfaces;

public interface Phone {

    public static final String DEFAULT_VOLUME = "40";

    String modelName();

    default void add(){
        System.out.println("Adding");
    }

    static void print(){
        System.out.println("Printing Phone");
    }
}
