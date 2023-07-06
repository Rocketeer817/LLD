package Synchronization.AdderSubtractorThirdParty;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);

        thread1.start();
        thread2.start();

        System.out.println(count.getValue());

        thread1.join();
        thread2.join();


        System.out.println(count.getValue());
        System.out.println(Count.getCounterValue());
    }
}
