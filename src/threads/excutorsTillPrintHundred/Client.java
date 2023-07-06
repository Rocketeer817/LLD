package threads.excutorsTillPrintHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for(int i=1;i<=100;i++){
            if(i==1 || i==5 || i==20 || i==37 || i==97){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }

        executor.shutdown();

        System.out.println("Ended");


    }
}
