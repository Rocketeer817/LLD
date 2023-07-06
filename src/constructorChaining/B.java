package constructorChaining;

public class B extends  A{
    public B(){
        System.out.println("Constructor B is called");
    }

    public String doSomething(){
        System.out.println("Doing something in B");
        return "";
    }
}
