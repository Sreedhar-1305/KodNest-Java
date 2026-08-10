package M02T04;

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 100;
        s1.name = "Sreedhar";
        s1.height = 5.4;
        s1.run();
        s1.sleep();
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.height);
    }
}

class Student {
    int rollno;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}
