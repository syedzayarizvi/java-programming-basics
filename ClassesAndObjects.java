class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Syed Shuja Abbas";
        student1.age = 20;

        student1.displayDetails();
    }
}
