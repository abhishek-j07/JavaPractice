package Exceptions;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            doSomething();
        } catch (CustomException e) {
            System.out.println(e);
        }
    }

    public static void doSomething() throws CustomException {

        try{
            int rem = 3/0;
        }catch(ArithmeticException e){
            throw new CustomException("Divide By Zero Exception");
        }

    }
}
