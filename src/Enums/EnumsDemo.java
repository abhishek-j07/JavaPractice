package Enums;

public class EnumsDemo {

    public static void main(String[] args) {

        Days day = Days.SUNDAY;
        System.out.println(day.getHindi());
        System.out.println(day.getLowerCase());
        System.out.println(day.ordinal());
        System.out.println(day.toString());
        System.out.println(Days.valueOf("MONDAY"));
    }
}
