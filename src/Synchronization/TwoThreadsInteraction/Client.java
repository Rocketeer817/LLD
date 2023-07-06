package Synchronization.TwoThreadsInteraction;

import java.util.Hashtable;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Waiter waiter = new Waiter();

        Thread thread1 = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    waiter.doSomethingStart();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                waiter.interruptSomething();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        hashtable.put(1,2);
    }
}
