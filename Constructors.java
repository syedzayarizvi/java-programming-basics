class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {

    public static void main(String[] args) {

        Student student1 = new Student("Syed Shuja Abbas", 20);
        Student student2 = new Student("Ahmed", 21);

        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
    }
}
