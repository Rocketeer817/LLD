package threads.printTillHundred;

public class PrintTillHundred implements Runnable{

    private int printNumber;

    public PrintTillHundred(int i){
        this.printNumber = i;
    }

    @Override
    public void run() {
        System.out.println("Printing "+
                this.printNumber + " . Current thread name is "+
                Thread.currentThread().getName()
        );
    }
}
