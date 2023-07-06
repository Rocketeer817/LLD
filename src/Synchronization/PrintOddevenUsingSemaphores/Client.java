package Synchronization.PrintOddevenUsingSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Semaphore oddSemaphore = new Semaphore(1);
        Semaphore evenSemaphore = new Semaphore(0);

        ThreadRunner threadRunner = new ThreadRunner(counter,true,oddSemaphore,evenSemaphore);

        ThreadRunner threadRunner1 = new ThreadRunner(counter,false,oddSemaphore,evenSemaphore);

        Thread thread1 = new Thread(threadRunner);
        Thread thread2 = new Thread(threadRunner1);

        thread1.start();

        thread2.start();

        thread1.join();
        thread2.join();



    }
}
