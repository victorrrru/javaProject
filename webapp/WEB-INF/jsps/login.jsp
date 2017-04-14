<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/4/10
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post" >
        姓名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit" value=登录>
    </form>
</body>
</html>
