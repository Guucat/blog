package week_3.task_1.com.util;

import java.sql.*;

/**
 * @author shengyi
 * @create 2021/8/3 - 13:42
 */
public class ConUtil {
    private ConUtil() {};

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String user = "root";
        String password = "123456";
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet res) {
        try {
            if (res != null) {
                res.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}
