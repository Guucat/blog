<%--
  Created by IntelliJ IDEA.
  User: 10278
  Date: 2021/8/15
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h3>这里是首页</h3><br/>
<%--<a href="hello1">HelloServletByAnnotation</a><br/>--%>
<%--<a href="<%=request.getContextPath()%>/hello2">HelloServletByXML</a><br/>--%>
<form action="<%=request.getContextPath()%>/query" method="get">
    user_id：<input type=text name=userId><br/>
    <input type=submit value="查询">
</form>
</body>
</html>
