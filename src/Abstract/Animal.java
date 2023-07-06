package Abstract;

public abstract class Animal {
    String name;
    int age;

    abstract void walk();

    abstract  void sleep();

    abstract  void eat();

    void makeSound(){
        System.out.println("Hey how are you? meow.......");
    }
}
