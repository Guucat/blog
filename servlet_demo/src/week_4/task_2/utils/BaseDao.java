package week_4.task_2.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shengyi
 * @create 2021/8/15 - 20:26
 */
public class BaseDao {
    private BaseDao(){};

    public static ResultSet QueryData(String sql, Object[] object) throws ClassNotFoundException, SQLException {
        Connection con = ConUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        for (int i = 0; i < object.length; i++) {
            ps.setObject(i + 1,  object[i] );
        }
        ResultSet res = ps.executeQuery();
        //ConUtil.close(con, ps, res );
        return res;
    }

    public static int UpdateDate(String sql, Object[] objects) throws SQLException, ClassNotFoundException {
        Connection con = ConUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i + 1, objects[i]);
        }
        int res = ps.executeUpdate();
        ConUtil.close(con, ps, null );
        return res;
    }
    public static int test(){
        return 1;
    }

}
