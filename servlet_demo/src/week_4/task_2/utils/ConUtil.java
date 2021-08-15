package week_4.task_2.utils;

import java.sql.*;

/**
 * @author shengyi
 * @create 2021/8/15 - 20:24
 */
public class ConUtil {
    private ConUtil() {};

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/servlet?useSSL=false";
        String user = "root";
        String password = "root";
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
