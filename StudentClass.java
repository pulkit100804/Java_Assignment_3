public class Student {
    String prn;
    String name;
    int marks;
    public Student(String prn, String name, int marks) {
        this.prn = prn;
        this.name = name;
        this.marks = marks;
    }
    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", Marks: " + marks);
    }
}
