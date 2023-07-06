package CopyConstructor;

public class Client {
    public static void main(String[] args){
        Student student = new Student("Rushee",25,"Scaler");
        Student studentCopy = new Student(student);

        System.out.println("debug");
    }
}
