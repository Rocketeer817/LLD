package Abstract;

public abstract class Cat extends  Animal{
    @Override
    void walk() {
        System.out.println("Walk with your paws");
    }

    @Override
    void sleep() {
        System.out.println("Sleep lightly");
    }

    abstract void eat();
}
