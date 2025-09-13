package Multithreading;

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("Main Thread Started");
        Thread1 t1 = new Thread1();
        t1.start();

        Thread t2 = new Thread(new Thread2());
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread Ended");
    }
}
