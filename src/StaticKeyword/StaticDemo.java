package StaticKeyword;

public class StaticDemo {

    public static void main(String[] args) {

        StaticDemo sd = new StaticDemo();
        Student student1 = new Student ("Ajay",10);
        Student student2 = new Student("Ram",20);
        Student student3 = new Student("Shyam",30);

        System.out.println(Student.count);
        System.out.println(sd.sum(1,3));
        System.out.println(diff(5,3));
    }

    public int sum(int a,int b){
        return a+b;
    }

    public static int diff(int a,int b){
        return a-b;
    }
}
