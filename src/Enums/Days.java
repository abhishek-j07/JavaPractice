package Enums;

public enum Days {

    SUNDAY("Sunday", "Ravivaar"),
    MONDAY("Monday", "Somvaar");

    private String lowerCase;
    private String hindi;

    Days(String lowerCase, String hindi) {
        this.lowerCase = lowerCase;
        this.hindi = hindi;
    }

    public String getLowerCase() {
        return this.lowerCase;
    }
    public String getHindi() {
        return this.hindi;
    }
}
