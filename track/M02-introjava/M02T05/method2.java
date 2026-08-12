package M02T05;

public class method2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.input("Sreedhar", 18, 5.4);
        s1.display();
    }
}

class Student {
    String name;
    int age;
    double height;

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    void input(String name, int age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
