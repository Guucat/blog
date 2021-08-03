package week_3.task_1.com.service.impl;

import week_3.task_1.com.dao.StudentDao;
import week_3.task_1.com.dao.impl.StudentDaoImpl;
import week_3.task_1.com.entity.Student;
import week_3.task_1.com.service.StudentService;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author shengyi
 * @create 2021/8/3 - 15:24
 */
public class StudentServiceImpl implements StudentService {

    StudentDaoImpl studentDao = new StudentDaoImpl();
    @Override
    public int addStudent(Student student) throws SQLException, ClassNotFoundException {
        return studentDao.addStudent(student);
    }

    @Override
    public int deleteStudentById(String studentId) throws SQLException, ClassNotFoundException {
        return studentDao.deleteStudentById(studentId);
    }

    @Override
    public int updateStudentById(String studentId, Student student) throws SQLException, ClassNotFoundException {
        return studentDao.updateStudentById(studentId,student);
    }

    @Override
    public ArrayList<Student> queryAllStudent() throws SQLException, ClassNotFoundException {
        return studentDao.queryAllStudent();
    }

    @Override
    public ArrayList<Student> queryStudentScoreFailed() throws SQLException, ClassNotFoundException {
        return studentDao.queryStudentScoreFailed();
    }
}
