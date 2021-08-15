package week_4.task_2.query;


import week_4.task_2.utils.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/15 - 20:19
 */
public class QueryUserById {
    public List<Integer> queryUserById(int user_id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT user_id FROM user WHERE user_id = ?";
        ResultSet res = BaseDao.QueryData(sql,new Object[] {user_id});
        List<Integer> result = new ArrayList<>();
        while (res.next()) {
            result.add(res.getInt(1));
        }
        return result;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        QueryUserById queryUserById = new QueryUserById();
        List<Integer> result = queryUserById.queryUserById(2);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
