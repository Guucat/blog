package week_3.task_1.com.entity;

/**
 * @author shengyi
 * @create 2021/8/3 - 14:44
 */
public class Student {
    private String studentId;
    private String name;
    private String sex;
    private int course1;
    private int course2;
    private  int course3;

    public Student(String studentId, String name, String sex, int course1, int course2, int course3) {
        this.studentId = studentId;
        this.name = name;
        this.sex = sex;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCourse1(int course1) {
        this.course1 = course1;
    }

    public void setCourse2(int course2) {
        this.course2 = course2;
    }

    public void setCourse3(int course3) {
        this.course3 = course3;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getCourse1() {
        return course1;
    }

    public int getCourse2() {
        return course2;
    }

    public int getCourse3() {
        return course3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", course1=" + course1 +
                ", course2=" + course2 +
                ", course3=" + course3 +
                '}';
    }
}
