package Synchronization.TwoThreadsInteraction;

public class Waiter{

    public Waiter(){

    }

    public synchronized void doSomethingStart() throws InterruptedException {
        System.out.println("do something");

        wait();

        System.out.println("Woke up after interruption");
    }

    public synchronized void interruptSomething(){
        System.out.println("interruption done");

        notify();
    }


}
