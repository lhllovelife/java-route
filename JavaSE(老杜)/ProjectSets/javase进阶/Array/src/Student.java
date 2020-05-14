public class Student {
    private String no;
    private String name;

    //构造方法
    public Student() {

    }
    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }
    //setter and getter

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
