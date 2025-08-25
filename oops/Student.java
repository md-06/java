public class Student {
    String name;
    int age;

    void display()
    {
        System.out.println("Name: "+name+", Age: "+age);
    }
    public static void main(String[] args) {
        Student s1= new Student();
    Student s2= new Student();
    s1.name="Mohammad ali";
    s1.display();
    s2.age=19;
    s2.display();
    }
}
