package Polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
        System.out.println(compileTimePolymorphism.add(1,2));
        System.out.println(compileTimePolymorphism.add(2,3,5));
        System.out.println(compileTimePolymorphism.add(10,20.0));

        //upcasting
        AnimalRuntimePolymorphism dog = new DogRuntimePolymorphism();
        System.out.println(dog.sayHello());

        //error
        AnimalRuntimePolymorphism dog2 = new DogRuntimePolymorphism();
        //System.out.println(dog2.sayBye());

    }
}
