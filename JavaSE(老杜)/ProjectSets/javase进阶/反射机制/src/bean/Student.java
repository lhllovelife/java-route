package bean;

public class Student {
    public String no;
    public String name;
    public int grade;

    public Student(){

    }

    public Student(String no) {
        this.no = no;
    }

    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(String no, String name, int grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
    }
}
