package Synchronization.Print1To10;

import java.util.ArrayList;
import java.util.*;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        ThreadRunner threadRunner = new ThreadRunner(counter,true);

        ThreadRunner threadRunner1 = new ThreadRunner(counter,false);

        Thread thread1 = new Thread(threadRunner);
        Thread thread2 = new Thread(threadRunner1);

        thread1.start();

        thread2.start();

        thread1.join();
        thread2.join();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

    }
}
