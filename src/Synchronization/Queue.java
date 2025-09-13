package Synchronization;

import java.util.LinkedList;

public class Queue {

    int size = 0;
    java.util.Queue<Integer> queue;

    public Queue(int size){
        this.size = size;
        queue = new LinkedList<>();
    }

    public boolean add(int value){

        synchronized (queue){
            while(queue.size() == size){
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            queue.add(value);
            queue.notifyAll();
            return true;
        }
    }

    public int remove(){
        synchronized (queue){
            while(queue.isEmpty()){
                try {
                    queue.wait();
                } catch (InterruptedException e) {}
            }
        }

        int element = queue.poll();
        queue.notifyAll();
        return element;
    }
}
