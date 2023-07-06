package Synchronization.Print1To10;

import java.util.concurrent.Semaphore;

public class ThreadRunner implements Runnable {
    private boolean oddFlag;
    private Counter counter;

    public ThreadRunner(Counter counter, boolean oddflag){
        this.counter = counter;
        this.oddFlag = oddflag;

    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            synchronized (counter){
                if(counter.oddFlag != oddFlag)
                {
                    System.out.println("waiting");
                    try {
                        counter.wait();
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                counter.printAndIncrement();
                counter.notify();
            }

        }
    }
}
