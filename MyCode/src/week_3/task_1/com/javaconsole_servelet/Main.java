package week_3.task_1.com.javaconsole_servelet;



import org.junit.Test;
import week_3.task_1.com.entity.Student;
import week_3.task_1.com.service.impl.StudentServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author shengyi
 * @create 2021/8/3 - 15:31
 */
public class Main {
    StudentServiceImpl studentService = new StudentServiceImpl();
    int num;

    //查询所有学生信息
    @Test
    public void testQueryAllStudent() throws SQLException, ClassNotFoundException {
        for (Student s : studentService.queryAllStudent()) {
            System.out.println(s.toString());
        }
    }

    //添加学生信息
    @Test
    public void testAddStudent() throws SQLException, ClassNotFoundException {
        Student student = new Student("2019212099","小h","男",100,88,96);
        num = studentService.addStudent(student);
        if (num != 0) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
    }

    //删除学生
    @Test
    public void testDeleteStudentById() throws SQLException, ClassNotFoundException {
        num = studentService.deleteStudentById("2019212092");
        if (num != 0) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
    }

    public static void main(String[] args) {
        try {
            StudentServiceImpl studentService = new StudentServiceImpl();
            int num;

            //添加学生信息
            Student student1 = new Student("2019212086","小唐","男",92,88,96);
            Student student2 = new Student("2019212087","小a","女",100,96,98);
            Student student3 = new Student("2019212088","小b","男",62,88,10);
            Student student4 = new Student("2019212089","小c","女",92,88,96);
            Student student5 = new Student("2019212090","小d","女",52,40,50);
            Student student6 = new Student("2019212092","小e","男",60,88,55);
            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);
            students.add(student6);
            for (Student student : students) {
                num = studentService.addStudent(student);
                if (num != 0) {
                    System.out.println("添加成功！");
                } else {
                    System.out.println("添加失败！");
                }
            }

            //删除学生
            num = studentService.deleteStudentById("2019212092");
            if (num != 0) {
                System.out.println("删除成功!");
            } else {
                System.out.println("删除失败!");
            }

            //修改学生小c的 name --> 小cc,course2 --> 98
            student3.setName("小cc");
            student3.setCourse2(98);
            num = studentService.updateStudentById("2019212089",student3);
            if (num != 0) {
                System.out.println("修改成功!");
            } else {
                System.out.println("修改失败!");
            }

            //查询所有学生信息
            for (Student s : studentService.queryAllStudent()) {
                System.out.println(s.toString());
            }

            //查找分数不及格的学生（3科总分300，180以下为不及格）
            System.out.println("以下为不及格的学生");
            for (Student s:
                    studentService.queryStudentScoreFailed()) {
                System.out.println(s.toString());
            }

        } catch (ClassNotFoundException | SQLException c) {
            c.printStackTrace();
        }

    }

}

