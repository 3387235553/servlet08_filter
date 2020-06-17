<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/login" method="post">

    账号：<input type="text" name="account"><br><br>
    密码：<input type="text" name="pwd"><br><br>
          <input type="submit" value="登录">

    <%--<a href="/login">/login</a><br><br>--%>
    <%--<a href="/aaa/abc">/aaa/*</a><br><br>--%>
    <%--<a href="/login/aaa/*">/login/aaa/*</a><br><br>--%>
    <%--<a href="*.do">*.do</a><br><br>--%>

    <%--<jsp:forward page="success.jsp"></jsp:forward>--%>

</form>
</body>
</html>
