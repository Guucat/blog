package com.tang.demo.servlet;

import week_4.task_2.utils.BaseDao;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import net.sf.json.*;

/**
 * @author shengyi
 * @create 2021/8/15 - 20:56
 */
@WebServlet(value = "/query")
public class QueryUserById extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        String sql = "SELECT user_id FROM user WHERE user_id = ?";
        String user_id = req.getParameter("user_id");
        int s = 0;
        try {
            ResultSet resultSet = BaseDao.QueryData(sql,new Object[] {user_id});
            resultSet.next();
            s = resultSet.getInt(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        res.setContentType("text/json;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String str ="{\"user_id\":\"" + s + "\"}";
        out.println(str);
        out.close();
    }
}
