package threads.printTillHundred;

public class Client {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            PrintTillHundred pth = new PrintTillHundred(i);
            Thread th = new Thread(pth);
            th.start();
            //th.run();
        }
    }
}
