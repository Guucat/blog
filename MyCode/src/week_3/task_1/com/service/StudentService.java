package week_3.task_1.com.service;

import week_3.task_1.com.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author shengyi
 * @create 2021/8/3 - 15:23
 */
public interface StudentService {
    public int addStudent(Student student) throws SQLException, ClassNotFoundException;
    public int deleteStudentById(String studentId) throws SQLException, ClassNotFoundException;
    public int updateStudentById(String studentId, Student student) throws SQLException, ClassNotFoundException;
    public ArrayList<Student> queryAllStudent() throws SQLException, ClassNotFoundException;
    public ArrayList<Student> queryStudentScoreFailed() throws SQLException, ClassNotFoundException;
}
