class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;  // 'this.name' = instance variable
        this.age = age;    // 'age' = local variable
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class st {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 22);
        s1.display();
    }
}

