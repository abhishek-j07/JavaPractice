package Synchronization;

public class SyncTest {

    Object o = new Object();

    public static void main(String[] args) {

    }

    public void doSomething(){
        synchronized (o){
            //critical section

        }
    }

    public synchronized void doSomethingAgain(){

        // synchronized(this)
    }
}
