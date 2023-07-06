package Synchronization.PrintOddevenUsingSemaphores;

import java.util.concurrent.Semaphore;

public class ThreadRunner implements Runnable {
    private boolean oddFlag;
    private Counter counter;

    private Semaphore oddSemaphore;
    private Semaphore evenSemaphore;

    public ThreadRunner(Counter counter, boolean oddflag, Semaphore oddSemaphore, Semaphore evenSemaphore){
        this.counter = counter;
        this.oddFlag = oddflag;
        this.oddSemaphore = oddSemaphore;
        this.evenSemaphore = evenSemaphore;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            if(oddFlag == true){
                try {
                    oddSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                try {
                    evenSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            counter.printAndIncrement();

            if(oddFlag==true){
                evenSemaphore.release();
            }
            else{
                oddSemaphore.release();
            }

        }
    }
}
