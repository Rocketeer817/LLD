package threads.excutorsTillPrintHundred;

public class NumberPrinter implements Runnable{
    private int printNumber;

    public NumberPrinter(int i){
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
