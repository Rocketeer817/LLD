package IntroToOop;

public class Client {
    public static void main(String[] args){
        Student rushee = new Student();
        rushee.name = "Rushee";
        rushee.batchName = "Nov2022";
        rushee.psp = 99.80;
        rushee.universityName = "IIT Kharagpur";

        System.out.println(rushee.batchName);

        rushee.giveMockInterview("DSA");

        AccessModifiers.Student student = new AccessModifiers.Student();
        student.psp = 88;

        Student st = new Student("Rocky");


    }
}
