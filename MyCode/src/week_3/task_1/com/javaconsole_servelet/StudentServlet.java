package week_3.task_1.com.javaconsole_servelet;

import week_3.task_1.com.entity.Student;
import week_3.task_1.com.service.impl.StudentServiceImpl;

import java.sql.SQLException;

/**
 * @author shengyi
 * @create 2021/8/3 - 15:27
 */
public class StudentServlet {
    StudentServiceImpl studentService = new StudentServiceImpl();
    public void addStudentStudentServlet(String studentId, String name, String sex, int course1, int course2, int course3) throws SQLException, ClassNotFoundException {
        Student student = new Student(studentId, name, sex, course1, course2, course3);
        studentService.addStudent(student);
    }

}
