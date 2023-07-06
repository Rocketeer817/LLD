package threads.printHelloWorld;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world");
        System.out.println(" printed by thread "+Thread.currentThread().getName());
    }
}
