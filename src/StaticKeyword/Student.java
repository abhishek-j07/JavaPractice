package StaticKeyword;

public class Student {

    public static int count = 0;

    static{
        System.out.println("This block will always be " +
                "initialized before class loading");
    }

    private String name;

    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
