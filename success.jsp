<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<%
 String data=(String)session.getAttribute("session-uid");
 out.println(" Login Successfully...!!!");
 %>
</body>
</html>