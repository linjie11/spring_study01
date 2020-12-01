<%--
  Created by IntelliJ IDEA.
  User: Iris
  Date: 2020/11/28
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
pageContext: ${pageScope.msg}<br/>
request: ${requestScope.msg}<br/>
session: ${sessionScope.msg}<br/>
application: ${applicationScope.msg}<br/>
<%System.out.println("来到页面了...");%>
</body>
</html>
