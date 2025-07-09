public class Student{
    String name;
    Student(){
        name = "Akash";
    }
    void display(){
        System.out.println("Student name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}