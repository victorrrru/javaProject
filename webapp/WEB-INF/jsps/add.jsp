<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/4/6
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body >

   <%-- <script type="text/javascript">
        $(document).ready(function(){
            var user = JSON.stringify(user);

            $.ajax({
                type:"POST",
                url:"${pageContext.request.contextPath}/user/saveUser1",
                dataType:"json",
                contentType:"application/json",
                data:JSON.stringify(user)

            });
        });
    </script>--%>

    <form action="${pageContext.request.contextPath}/user/saveUser1" method="post" >
        姓名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        性别：<input type="radio" name="gendar" value="男" >男
        <input type="radio" name="gendar" value="女" >女<br>
        电话：<input type="text" name="telephone"><br>
        出生年月：<input type="text" name="birthday"><br>
        备注：<input type="text" name="remark"><br>
        <input type="submit" value=注册>
    </form>
</body>
</html>
