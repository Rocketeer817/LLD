package Synchronization.PrintOddevenUsingSemaphores;

import java.util.concurrent.Semaphore;

public class ThreadSemaphoreRunner implements Runnable{
    private Semaphore oddSemaphore, evenSemaphore;
    private boolean oddFlag;
    private int maxValue;

    public ThreadSemaphoreRunner(int maxValue,boolean oddFlag,Semaphore oddSemaphore,Semaphore evenSemaphore){
        this.evenSemaphore = evenSemaphore;
        this.oddFlag = oddFlag;
        this.oddSemaphore = oddSemaphore;
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
        if(oddFlag){
            for(int i=1;i<=maxValue;i+=2){
                try {
                    oddSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Print "+i + " in thread "+ Thread.currentThread());

                evenSemaphore.release();

            }
        }
        else{
            for(int i=2;i<=maxValue;i+=2){
                try {
                    evenSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Print "+i + " in thread "+ Thread.currentThread());

                oddSemaphore.release();
            }
        }
    }
}
