package Synchronization.Semaphores.ProducerConsumerPattern;

import constructorChaining.P;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        //Take Concurrent data structure
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        int maxsize = 8;

        Producer p1 = new Producer(q,maxsize,"p1");
        Producer p2 = new Producer(q,maxsize,"p2");
        Producer p3 = new Producer(q,maxsize,"p3");

        Consumer c1 = new Consumer(q,maxsize,"c1");
        Consumer c2 = new Consumer(q,maxsize,"c2");
        Consumer c3 = new Consumer(q,maxsize,"c3");
        Consumer c4 = new Consumer(q,maxsize,"c4");
        Consumer c5 = new Consumer(q,maxsize,"c5");


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);


        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);
        Thread t7 = new Thread(c4);
        Thread t8 = new Thread(c5);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();





    }
}
