package Static;

public class Client {

    public static void main(String [] args)
    {
        Country country = new Continent();
        country.printSomething();

        int a = 10, b = 5;  //1

        double c = (a * 1.0) / b; //2

        System.out. println(c); //3

        int x  = -23;

        System.out.println(x%5);

        Continent.kickSomething();

    }
}
