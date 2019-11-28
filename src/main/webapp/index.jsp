<!doctype html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>" />
    <meta charset="utf-8">
    <title>HomeJSP</title>
</head>

<body>
    <p>JSP Page</p>
    <p><%=basePath%></p>
</body>
</html>
