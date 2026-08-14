package M02T05;

public class method4 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
        student s2 = new student("Hari");
        s2.display();
        student s3 = new student("Ramu", 22, 6.0);
        s3.display();
    }
}

class student {
    String name;
    int age;
    double height;

    student() {
        name = "Anup";
        age = 21;
        height = 5.0;
    }

    student(String name) {
        this.name = name;
    }

    student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
