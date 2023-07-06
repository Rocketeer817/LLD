package Synchronization.Semaphores.ProducerConsumerPattern;

import java.util.Queue;

public class Producer implements  Runnable{
    private Queue<Integer> queue;

    private int maxSize;

    private String name;

    public Producer(Queue<Integer> q, int maxSize, String name){
        this.queue =    q;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            if(queue.size()<maxSize){
                var k = 1;
                System.out.println(name + " adding shirt "+ k + "as a producer. " + "Queue size before adding is : "+ queue.size());
                queue.add(k);
            }
        }

    }
}
