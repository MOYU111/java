//Student.java
public class Student extends Object {
    private String id;
    private String name;
    private double grade;
    private boolean isOff;


    public Student(String s) {
        super();
    }

    public void Student(String id, String name,double grade,boolean isOff) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.isOff = isOff;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getgrade() {
        return grade;
    }

    public void setgrade(double grade) {
        this.grade = grade;
    }



    @Override
    public String toString() {
        return "学号:" + id + "姓名: " + name + "高数成绩: " + grade ;
    }
}

