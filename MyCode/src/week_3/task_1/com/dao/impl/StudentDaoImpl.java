package week_3.task_1.com.dao.impl;

import week_3.task_1.com.dao.StudentDao;
import week_3.task_1.com.entity.Student;
import week_3.task_1.com.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author shengyi
 * @create 2021/8/3 - 14:58
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public int addStudent(Student student) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO student (student_id, name, sex, course1, course2, course3) VALUES (?, ?, ?, ?, ?, ?);";
        return BaseDao.UpdateDate(sql, new Object[] {student.getStudentId(),student.getName(),student.getSex(),
                student.getCourse1(),student.getCourse2(),student.getCourse3()});
    }

    @Override
    public int deleteStudentById(String studentId) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM student WHERE student_id = ?";
        return BaseDao.UpdateDate(sql, new Object[] {studentId});
    }

    @Override
    public int updateStudentById(String studentId, Student student) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE student SET name=?, sex=?, course1=?, course2=?, course3=? WHERE student_id = ?";
        return BaseDao.UpdateDate(sql,new Object[] {student.getName(), student.getSex(), student.getCourse1(),
                student.getCourse2(), student.getCourse3(), student.getStudentId()});
    }

    @Override
    public ArrayList<Student> queryAllStudent() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM student";
        ResultSet res = BaseDao.QueryData(sql,new Object[] {});
        ArrayList<Student> students = new ArrayList<>();
        while (res.next()) {
            Student student = new Student(res.getString(1), res.getString(2),
                    res.getString(3), res.getInt(4), res.getInt(5),res.getInt(6));
            students.add(student);
        }
        return students;
    }

    @Override
    public ArrayList<Student> queryStudentScoreFailed() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM student WHERE course1 + course2 + course3 < 180";
        ResultSet res = BaseDao.QueryData(sql, new Object[] {});
        ArrayList<Student> students = new ArrayList<>();
        while (res.next()) {
            Student student = new Student(res.getString(1), res.getString(2),
                    res.getString(3), res.getInt(4), res.getInt(5),res.getInt(6));
            students.add(student);
        }
        return students;
    }
}
