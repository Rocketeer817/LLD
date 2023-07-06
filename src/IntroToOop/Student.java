package IntroToOop;

public class Student {
    public String name;

    public String batchName;

    public double psp;

    public String universityName;

    public  Student(){

    }
    public Student(String name){
        System.out.println(name);
        this.name = name;
    }

    public Student(Student student){
        this.name = student.name;
        this.universityName = student.universityName;
        student.doSomething();
    }


    void ChangeBatch(String newBatch){
        batchName = newBatch;
    }

    void giveMockInterview(String topic){
        System.out.println("Giving mock interview for "+topic);
    }

    private void doSomething(){

    }
}
