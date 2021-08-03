package week_3.task_1.com.dao;

import week_3.task_1.com.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/3 - 14:57
 */
public interface StudentDao {
    public int addStudent(Student student) throws SQLException, ClassNotFoundException;
    public int deleteStudentById(String studentId) throws SQLException, ClassNotFoundException;
    public int updateStudentById(String studentId, Student student) throws SQLException, ClassNotFoundException;
    public List<Student> queryAllStudent() throws SQLException, ClassNotFoundException;
    public List<Student> queryStudentScoreFailed() throws SQLException, ClassNotFoundException;
}
