package Abstract;

public class Client {
    public static void main(String[] args) {
        Animal pt = new PersianTiger();
        pt.eat();


        PersianTiger pt2 = new PersianTiger();
        pt2.actCute();
    }
}
