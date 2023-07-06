package Synchronization.Semaphores.ProducerConsumerPattern;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Integer> queue;

    private int maxSize;

    private String name;

    public Consumer(Queue<Integer> q, int maxSize, String name){
        this.queue =    q;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            if(queue.size()>0){
                var k = queue.peek();
                System.out.println(name + " removing shirt "+ k + " as a consumer "+"Queue size before adding is : "+ queue.size());
                queue.poll();
            }
        }


    }
}
