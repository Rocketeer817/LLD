package CopyConstructor;

public class Student {
    private int age;
    public String name;
    public String universityName;

    public Student(){

    }

    public Student(String name,int age,String universityName){
        this.name = name;
        this.age = age;
        this.universityName = universityName;
    }

    //Important
    public Student(Student student){
        System.out.println("Address of the student object is "+ student);
        System.out.println("Address at this point is "+ this);
        this.name = student.name;
        this.age = student.age;
        //Here access modifiers are specific to class not objects
        this.universityName = student.universityName;
    }


}
