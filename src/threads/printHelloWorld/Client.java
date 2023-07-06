package threads.printHelloWorld;

import threads.printHelloWorld.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world. printed by thread "+Thread.currentThread().getName());

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();

        doSomething();
    }

    public  static  void doSomething(){
        System.out.println("Hello world. printed by thread "+Thread.currentThread().getName());
    }
}
