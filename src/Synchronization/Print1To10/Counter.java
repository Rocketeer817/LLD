package Synchronization.Print1To10;

public class Counter {
    public int count = 1;

    public boolean oddFlag = true;



    public synchronized void printAndIncrement(){

        if(count<=10){
            System.out.println(count + "\t" + Thread.currentThread());
            count++;
            if(count%2==0){
                oddFlag = false;
            }
            else{
                oddFlag = true;
            }
        }
    }
}
