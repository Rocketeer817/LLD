package Synchronization.AdderSubtractorThirdParty;

public class Count {
    private  int value = 0;

    private static int counter = 0;

    public synchronized void incrementValue(int i){
        value += i;
    }

    public  synchronized  void decrementValue(int i){value -= i;}

    public int getValue(){
        return value;
    }

    public static int getCounterValue(){
        return counter;
    }

    public synchronized void doSomething(int i){
        counter += i;
        //System.out.println("YO nice ass" + counter);
    }

    public static synchronized void decreaseSomething(int i){
        counter -= i;
    }

}
