package constructorChaining;

public class C extends  B{
    String name;
    public C(){
        System.out.println("Constructor C is called");
    }

    public C(String name) {
        this.name = name;
        System.out.println("Constructor C is started with attribute "+ name);
    }

}
